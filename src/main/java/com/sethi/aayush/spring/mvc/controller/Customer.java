package com.sethi.aayush.spring.mvc.controller;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Customer {

	public String firstName;

	@NotNull(message = "is required")
	@Size(min = 1, message = "is required")
	public String lastName;

	@Max(value = 10, message = "value should be less than 10")
	@Min(value = 0, message = "must be greater than or equal to zero")
	@NotNull(message = "is required")
	private Integer freePasses;

	@Pattern(regexp = "^[a-zA-Z0-9]{6}", message = "only 6 chars/digits")
	@NotNull(message = "is required")
	private String postalCode;

	@CourseCode(value="iot")
	private String courseCode;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getFreePasses() {
		return freePasses;
	}

	public void setFreePasses(Integer freePasses) {
		this.freePasses = freePasses;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
}
