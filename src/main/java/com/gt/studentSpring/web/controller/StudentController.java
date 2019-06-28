package com.gt.studentSpring.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gt.studentSpring.web.model.Student;
//import com.gt.studentSpring.web.service.StudentService;

@Controller
public class StudentController {
	
//	@Autowired
//	StudentService studentService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(Model model) {
		model.addAttribute("title", "Teest!");
		return "index";
	}
//    @RequestMapping(value = "/students", method = RequestMethod.GET)
//	public String studentsPage(Model model) {
//    	Student student = new Student("Jimmy");
//    	List<Student> result = studentService.createStudent(student);
//    	model.addAttribute("student", result);
//		return "students";
//	}
}