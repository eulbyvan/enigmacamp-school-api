package com.enigmacamp.repo;

import com.enigmacamp.model.Major;

import java.util.List;
import java.util.Optional;

/**
 * @author stu (https://www.eulbyvan.com/)
 * @version 1.0
 * @since 29/11/22
 */

public interface IMajorRepo {
	Major createMajor(Major major);

	List<Major> getAllMajors();

	Optional<Major> getMajorById(int id);

	void updateMajorById(int id, Major major);

	void deleteMajorById(int id);
}

