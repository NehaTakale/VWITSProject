package com.vwits.register;

public class Teacher {

	String tfirstname,tlastname,tpassword,tconfirmpassword,temail;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((tconfirmpassword == null) ? 0 : tconfirmpassword.hashCode());
		result = prime * result + ((temail == null) ? 0 : temail.hashCode());
		result = prime * result + ((tfirstname == null) ? 0 : tfirstname.hashCode());
		result = prime * result + ((tlastname == null) ? 0 : tlastname.hashCode());
		result = prime * result + ((tpassword == null) ? 0 : tpassword.hashCode());
		return result;
	}

	public String getTfirstname() {
		return tfirstname;
	}

	public void setTfirstname(String tfirstname) {
		this.tfirstname = tfirstname;
	}

	public String getTlastname() {
		return tlastname;
	}

	public void setTlastname(String tlastname) {
		this.tlastname = tlastname;
	}

	public String getTpassword() {
		return tpassword;
	}

	public void setTpassword(String tpassword) {
		this.tpassword = tpassword;
	}

	public String getTconfirmpassword() {
		return tconfirmpassword;
	}

	public void setTconfirmpassword(String tconfirmpassword) {
		this.tconfirmpassword = tconfirmpassword;
	}

	public String getTemail() {
		return temail;
	}

	public void setTemail(String temail) {
		this.temail = temail;
	}

	@Override
	public String toString() {
		return "Teacher [tfirstname=" + tfirstname + ", tlastname=" + tlastname + ", tpassword=" + tpassword
				+ ", tconfirmpassword=" + tconfirmpassword + ", temail=" + temail + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Teacher other = (Teacher) obj;
		if (tconfirmpassword == null) {
			if (other.tconfirmpassword != null)
				return false;
		} else if (!tconfirmpassword.equals(other.tconfirmpassword))
			return false;
		if (temail == null) {
			if (other.temail != null)
				return false;
		} else if (!temail.equals(other.temail))
			return false;
		if (tfirstname == null) {
			if (other.tfirstname != null)
				return false;
		} else if (!tfirstname.equals(other.tfirstname))
			return false;
		if (tlastname == null) {
			if (other.tlastname != null)
				return false;
		} else if (!tlastname.equals(other.tlastname))
			return false;
		if (tpassword == null) {
			if (other.tpassword != null)
				return false;
		} else if (!tpassword.equals(other.tpassword))
			return false;
		return true;
	}

	
	}



