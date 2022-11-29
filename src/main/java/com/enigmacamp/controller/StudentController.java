package com.enigmacamp.controller;

import com.enigmacamp.model.Student;
import com.enigmacamp.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * @author stu (https://www.eulbyvan.com/)
 * @version 1.0
 * @since 29/11/22
 */

@RestController
@RequestMapping("/students")
public class StudentController {
	@Autowired
	IStudentService studentService;

	@GetMapping
	public List<Student> findAllStudent() {
		return studentService.findAllStudents();
	}

	@GetMapping("/{id}")
	public Optional<Student> findStudentById(@PathVariable("id") int id) {
		return studentService.findStudentById(id);
	}

	@PostMapping
	public Student addStudent(@RequestBody Student student) {
		return studentService.addStudent(student);
	}

	@PostMapping("/{id}")
	public void editStudent(@PathVariable int id, @RequestBody Student student) {
		studentService.editStudent(id, student);
	}

	@PostMapping("/{id}")
	public void removeStudent(@PathVariable("id") int id) {
		studentService.removeStudent(id);
	}
}
