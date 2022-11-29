package com.enigmacamp.controller;

import com.enigmacamp.model.Major;
import com.enigmacamp.service.IMajorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author stu (https://www.eulbyvan.com/)
 * @version 1.0
 * @since 29/11/22
 */

@RestController
@RequestMapping("/majors")
public class MajorController {
	@Autowired
	IMajorService majorService;

	@GetMapping
	public List<Major> findAllMajor() {
		return majorService.findAllMajors();
	}

//	@GetMapping("/{id}")
//	public Optional<Major> findMajorById(@PathVariable("id") int id) {
//		return majorService.findMajorById(id);
//	}

	@PostMapping
	public Major addMajor(@RequestBody Major major) {
		return majorService.addMajor(major);
	}

//	@PutMapping("/{id}")
//	public void editMajor(@PathVariable int id, @RequestBody Major major) {
//		majorService.editMajor(id, major);
//	}
//
//	@DeleteMapping("/removeMajor/{id}")
//	public void removeMajor(@PathVariable("id") int id) {
//		majorService.removeMajor(id);
//	}
}
