package com.spring.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.spring.model.Person;

public class PersonValidator implements Validator {

	public boolean supports(Class<?> clazz) {
		return Person.class.isAssignableFrom(clazz);
	}

	public void validate(Object target, Errors errors) {
		Person person = (Person) target;
		if (person.getName() == null || person.getName().length() == 0) {
			errors.rejectValue("name", "fieldName.required");
		}
		//ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "fieldName.required");
	}
	
}
