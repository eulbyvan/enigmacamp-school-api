package com.enigmacamp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import javax.annotation.processing.Generated;

/**
 * @author stu (https://www.eulbyvan.com/)
 * @version 1.0
 * @since 29/11/22
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
	private int studentId;
	private String firstName;
	private String lastName;
	private String email;
	private Major major;
}
