package com.school.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "courses")
public class Course {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "number")
	private String number;
	@Column(name = "name")
	private String name;
	@Column(name = "teacher")
	private String teacher;
	@Column(name = "week")
	private String week;
	@Column(name = "time")
	private String time;
	@Column(name = "credit")
	private String credit;
	
	public Course() {
		
	}

	public Course(String number, String name, String teacher, String time, String credit) {
		super();
		this.number = number;
		this.name = name;
		this.teacher = teacher;
		this.time = time;
		this.credit = credit;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTeacher() {
		return teacher;
	}

	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getCredit() {
		return credit;
	}

	public void setCredit(String credit) {
		this.credit = credit;
	}

	public String getWeek() {
		return week;
	}

	public void setWeek(String week) {
		this.week = week;
	}

	
}
