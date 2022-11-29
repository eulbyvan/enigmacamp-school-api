package com.enigmacamp.service;

import com.enigmacamp.model.Major;
import com.enigmacamp.repo.IMajorRepo;
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
public class MajorService implements IMajorService {
	@Autowired
	IMajorRepo majorRepo;

	@Override
	public Major addMajor(Major major) {
		return majorRepo.createMajor(major);
	}

	@Override
	public List<Major> findAllMajors() {
		return majorRepo.getAllMajors();
	}

	@Override
	public Optional<Major> findMajorById(int id) {
		return majorRepo.getMajorById(id);
	}

	@Override
	public void editMajor(int id, Major major) {
		majorRepo.updateMajorById(id, major);
	}

	@Override
	public void removeMajor(int id) {
		majorRepo.deleteMajorById(id);
	}
}

