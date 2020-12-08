package com.vwits.register;

public class Student {
	String firstn,lastn,pass,confirmpass,email;
	
	public String getFirstn() {
		return firstn;
	}
	public void setFirstn(String firstn) {
		this.firstn = firstn;
	}
	public String getLastn() {
		return lastn;
	}
	public void setLastn(String lastn) {
		this.lastn = lastn;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getConfirmpass() {
		return confirmpass;
	}
	public void setConfirmpass(String confirmpass) {
		this.confirmpass = confirmpass;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((confirmpass == null) ? 0 : confirmpass.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((firstn == null) ? 0 : firstn.hashCode());
		result = prime * result + ((lastn == null) ? 0 : lastn.hashCode());
		result = prime * result + ((pass == null) ? 0 : pass.hashCode());
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
		if (confirmpass == null) {
			if (other.confirmpass != null)
				return false;
		} else if (!confirmpass.equals(other.confirmpass))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (firstn == null) {
			if (other.firstn != null)
				return false;
		} else if (!firstn.equals(other.firstn))
			return false;
		if (lastn == null) {
			if (other.lastn != null)
				return false;
		} else if (!lastn.equals(other.lastn))
			return false;
		if (pass == null) {
			if (other.pass != null)
				return false;
		} else if (!pass.equals(other.pass))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Student [firstn=" + firstn + ", lastn=" + lastn + ", pass=" + pass + ", confirmpass=" + confirmpass
				+ ", email=" + email +  "]";
	}
	
	

}
