package com.enigmacamp.repo;

import com.enigmacamp.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @author stu (https://www.eulbyvan.com/)
 * @version 1.0
 * @since 29/11/22
 */

@Repository
public class StudentRepo implements IStudentRepo {
	List<Student> studentList = new ArrayList<>();

	@Override
	public Student createStudent(Student student) {
		studentList.add(student);
		return student;
	}

	@Override
	public List<Student> getAllStudents() {
		return studentList;
	}

	@Override
	public Optional<Student> getStudentById(int id) {
		for (Student s : studentList) {
			if (s.getStudentId() == id) return Optional.of(s);
		}
		return Optional.empty();
	}

	@Override
	public void updateStudentById(int id, Student student) {
		Optional<Student> existingStudent = getStudentById(id);
		if (existingStudent.isPresent()) {
			existingStudent.get().setFirstName(student.getFirstName());
			existingStudent.get().setLastName(student.getLastName());
			existingStudent.get().setEmail(student.getLastName());
			existingStudent.get().setMajor(student.getMajor());
		}
	}

	@Override
	public void deleteStudentById(int id) {
		Optional<Student> existingStudent = getStudentById(id);
		if (existingStudent.isPresent()) {
			studentList.remove(existingStudent);
		}
	}
}
