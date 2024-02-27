package com.demo.entity;

import java.util.Date;

import javax.xml.crypto.Data;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "todos")
public class Todo {
	@Id
	@GeneratedValue
	private long id;
	@Column(name = "user_name")
	private String userName;
	@Column(name = "descroption")
	@Size(min = 10, message = "Enter at least 10 Characters")
	private String description;
	@Column(name = "target_Date")
	private Date targetDate;

	public Todo() {
		super();
	}

	public Todo(String userName, String description, Date targetDate) {
		super();
		this.userName = userName;
		this.description = description;
		this.targetDate = targetDate;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getTargetDate() {
		return targetDate;
	}

	public void setTargetDate(Date targetDate) {
		this.targetDate = targetDate;
	}

}
