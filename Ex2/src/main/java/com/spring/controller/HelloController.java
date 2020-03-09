package com.spring.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.spring.model.Person;
import com.spring.validator.PersonValidator;

@Controller
/* @RequestMapping("/admin") chỗ này mapping thêm 1 servlet path */
@EnableWebMvc
public class HelloController implements WebMvcConfigurer {

	// reference from xml
	@Autowired 
	private Person person1;

	//	@Bean(name= "personValidator")
	//	@Scope(value="singleton")
	//	public PersonValidator personValidator() {
	//		return new PersonValidator();
	//	}

	@Autowired
	private PersonValidator personValidator;

	//	@Autowired
	//	private PersonValidator personValidator;

	@Autowired
	@Qualifier("person2") // 2 Bean trở lên thì dùng để tránh trùng bean
	private Person person2;

	@Bean(name = "person2", initMethod = "init", destroyMethod = "destroy")
	@Scope(value = "singleton")
	public Person person() {
		Person person = new Person("ThuanHuhu", 20);
		return person;
	}

	// multie servlet path
	@RequestMapping(value = {"/index","/thuan"})
	public String sayHello(Model model) {
		model.addAttribute("msg1", person1);
		model.addAttribute("msg2", person2);
		return "hello";
	}

	// return Model,ModelAndView,ModelView,String
	@RequestMapping(value="huhu")
	public String sayHello2(Model model,HttpServletRequest request,HttpServletResponse response ,
			@RequestParam(name="msg1",required=false) String msg1,
			@RequestHeader(name="Cookie", required=false) String msg2,
			@RequestHeader(name="Content-Type", required=false) String msg3) {
		model.addAttribute("msg1", msg1);
		model.addAttribute("msg2", msg2);
		model.addAttribute("msg3", msg3);
		return "hello";
	}

	@RequestMapping(value="add",method=RequestMethod.GET)
	public String addUser(HttpServletRequest request) {
		request.setAttribute("user", new Person("Thuan", 20));
		return "hello";
	}

	//overload
	@RequestMapping(value="add",method=RequestMethod.POST)
	public String addUser(HttpServletRequest request,@ModelAttribute("user") Person person) {
		request.setAttribute("person",person);
		return "viewUser";
	}

	//test data request 
	@RequestMapping(value="add3",method=RequestMethod.POST)
	public String addUser3(HttpServletRequest request,@ModelAttribute("user") Person person,
			BindingResult bindingResult) {
		personValidator.validate(person, bindingResult);
		if (bindingResult.hasErrors()) {
			return "hello";
		}
		request.setAttribute("person", person);
		return "viewUser";
	}

	@RequestMapping(value="upload",method=RequestMethod.GET)
	public String upload() {
		return "upload";
	}

	@RequestMapping(value="upload",method=RequestMethod.POST)
	public String upload(HttpServletRequest request,@RequestParam(name="file") MultipartFile file) {
		//file.getOriginalFilename();
		File file2 = new File("C:\\Users\\thuan\\Desktop\\" + file.getOriginalFilename());
		try {
			FileOutputStream fileOutputStream = new FileOutputStream(file2);
			fileOutputStream.write(file.getBytes());
			fileOutputStream.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		request.setAttribute("file", file);
		return "uploadView";
	}
	
	@RequestMapping(value="dowload",method=RequestMethod.GET)
	public void dowload(HttpServletResponse respone) {
		String dataDirectory = "C:\\Users\\thuan\\Desktop\\aa";
		Path file = Paths.get(dataDirectory, "1.png");
		if (Files.exists(file)) {
			respone.setContentType("imgage/png");
			respone.setHeader("Content-Disposition", "attachment; filename=anh.jpeg");
			try {
				Files.copy(file, respone.getOutputStream());
				respone.getOutputStream().flush();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
