package io.rohitstudent;

import java.time.LocalDate;

public class Student {
	String name;String reg_ID;String email;
	LocalDate dob;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getReg_ID() {
		return reg_ID;
	}

	public void setReg_ID(String reg_ID) {
		this.reg_ID = reg_ID;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public Student(String name, String reg_ID, String email, LocalDate dob) {
		super();
		this.name = name;
		this.reg_ID = reg_ID;
		this.email = email;
		this.dob = dob;
	}

	public Student() {
		super();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dob == null) ? 0 : dob.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((reg_ID == null) ? 0 : reg_ID.hashCode());
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
		if (dob == null) {
			if (other.dob != null)
				return false;
		} else if (!dob.equals(other.dob))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (reg_ID == null) {
			if (other.reg_ID != null)
				return false;
		} else if (!reg_ID.equals(other.reg_ID))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return  name + ":" + reg_ID + ":" + email + ":" + dob ;
	}
 
}
