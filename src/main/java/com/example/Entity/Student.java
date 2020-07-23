package com.example.Entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name= "student",
uniqueConstraints = {
		@UniqueConstraint(columnNames = "stclass")
}
   )

public class Student 
{
	private Integer id;
	private String name;
	private String stclass;
	private String fathername;
	private String mothername;
	private String rollno;
	
	public Student(Integer id, String name, String stclass, String fathername, String mothername, String rollno) {
		super();
		this.id = id;
		this.name = name;
		this.stclass = stclass;
		this.fathername = fathername;
		this.mothername = mothername;
		this.rollno = rollno;
	}

	public Student() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStclass() {
		return stclass;
	}

	public void setStclass(String stclass) {
		this.stclass = stclass;
	}

	public String getFathername() {
		return fathername;
	}

	public void setFathername(String fathername) {
		this.fathername = fathername;
	}

	public String getMothername() {
		return mothername;
	}

	public void setMothername(String mothername) {
		this.mothername = mothername;
	}

	public String getRollno() {
		return rollno;
	}

	public void setRollno(String rollno) {
		this.rollno = rollno;
	}

	

	
	/*
	  git cokklvrnnvn rjnv
	  rvmvovio
	  vikv
	  
	 */
	

}
