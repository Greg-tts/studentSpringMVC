//package com.gt.studentSpring.web.service;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.gt.studentSpring.web.model.Student;
//import com.gt.studentSpring.web.repository.StudentRepository;
//
//@Service
//public class StudentService
//{
//	@Autowired
//	StudentRepository studentRepository;
//	
//	public List<Student> createStudent(Student student)
//	{
//		studentRepository.save(student);
//		return studentRepository.findAllStudents();
//	}
//}