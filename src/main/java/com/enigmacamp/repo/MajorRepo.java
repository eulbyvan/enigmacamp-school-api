package com.enigmacamp.repo;

import com.enigmacamp.model.Major;
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
public class MajorRepo implements IMajorRepo {
	List<Major> majorList = new ArrayList<>();

	@Override
	public Major createMajor(Major major) {
		majorList.add(major);
		return major;
	}

	@Override
	public List<Major> getAllMajors() {
		return majorList;
	}

	@Override
	public Optional<Major> getMajorById(int id) {
		for (Major s : majorList) {
			if (s.getMajorId() == id) return Optional.of(s);
		}
		return Optional.empty();
	}

	@Override
	public void updateMajorById(int id, Major major) {
		Optional<Major> existingMajor = getMajorById(id);
		if (existingMajor.isPresent()) {
			existingMajor.get().setMajorName(major.getMajorName());
		}
	}

	@Override
	public void deleteMajorById(int id) {
		Optional<Major> existingMajor = getMajorById(id);
		if (existingMajor.isPresent()) {
			majorList.remove(existingMajor);
		}
	}
}

