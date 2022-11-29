package com.enigmacamp.service;

import com.enigmacamp.model.Student;
import com.enigmacamp.repo.IStudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author stu (https://www.eulbyvan.com/)
 * @version 1.0
 * @since 29/11/22
 */

@Service
public class StudentService implements IStudentService {
	@Autowired
	IStudentRepo studentRepo;

	@Override
	public Student addStudent(Student student) {
		return studentRepo.createStudent(student);
	}

	@Override
	public List<Student> findAllStudents() {
		return studentRepo.getAllStudents();
	}

	@Override
	public Optional<Student> findStudentById(int id) {
		return studentRepo.getStudentById(id);
	}

	@Override
	public void editStudent(int id, Student student) {
		studentRepo.updateStudentById(id, student);
	}

	@Override
	public void removeStudent(int id) {
		studentRepo.deleteStudentById(id);
	}
}
