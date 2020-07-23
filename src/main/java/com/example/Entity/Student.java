package com.example.Entity;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fathername == null) ? 0 : fathername.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((mothername == null) ? 0 : mothername.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((rollno == null) ? 0 : rollno.hashCode());
		result = prime * result + ((stclass == null) ? 0 : stclass.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (fathername == null) {
			if (other.fathername != null)
				return false;
		} else if (!fathername.equals(other.fathername))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (mothername == null) {
			if (other.mothername != null)
				return false;
		} else if (!mothername.equals(other.mothername))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (rollno == null) {
			if (other.rollno != null)
				return false;
		} else if (!rollno.equals(other.rollno))
			return false;
		if (stclass == null) {
			if (other.stclass != null)
				return false;
		} else if (!stclass.equals(other.stclass))
			return false;
		return true;
	}
	

}
