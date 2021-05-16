/*
	@Author : thuan
	@Date : May 10, 2021
*/

package assignment_501;

public class Validator {
	public static String checkCourseCode(String courseCode) throws Exception {
		if(!courseCode.matches("[F][W][0-9]{3}")) throw new Exception("Course code is incorret. Example: FW001");
		return courseCode;
	}
	
	public static String checkStatus(String status) throws Exception {
		if("active".equals(status) || "in-active".equals(status)) return status;
		else throw new Exception("Status: only accept ‘active’ or ‘in-active’");
	}
	
	public static String checkFlag(String flag) throws Exception {
		if("optional".equals(flag) || "mandatory".equals(flag) || "N/A".equals(flag)) return flag;
		else throw new Exception("Flag only accept ‘optional’, ‘mandatory’, ‘N/A’");
	}
	
}
