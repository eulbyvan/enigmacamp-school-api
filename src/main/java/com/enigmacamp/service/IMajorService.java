package com.enigmacamp.service;

import com.enigmacamp.model.Major;

import java.util.List;
import java.util.Optional;

/**
 * @author stu (https://www.eulbyvan.com/)
 * @version 1.0
 * @since 29/11/22
 */

public interface IMajorService {
 Major addMajor(Major major);
 List<Major> findAllMajors();
 Optional<Major> findMajorById(int id);
 void editMajor(int id, Major major);
 void removeMajor(int id);
}
