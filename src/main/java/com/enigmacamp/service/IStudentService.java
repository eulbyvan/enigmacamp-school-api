package com.enigmacamp.service;

import com.enigmacamp.model.Student;

import java.util.List;
import java.util.Optional;

/**
 * @author stu (https://www.eulbyvan.com/)
 * @version 1.0
 * @since 29/11/22
 */

public interface IStudentService {
	Student addStudent(Student student);
	List<Student> findAllStudents();
	Optional<Student> findStudentById(int id);
	void editStudent(int id, Student student);
	void removeStudent(int id);
}
