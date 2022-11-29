package com.enigmacamp.repo;

import com.enigmacamp.model.Student;

import java.util.List;
import java.util.Optional;

/**
 * @author stu (https://www.eulbyvan.com/)
 * @version 1.0
 * @since 29/11/22
 */

public interface IStudentRepo {
	Student createStudent(Student student);
	List<Student> getAllStudents();
	Optional<Student> getStudentById(int id);
	void updateStudentById(int id, Student student);
	void deleteStudentById(int id);
}
