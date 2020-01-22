package com.bridgelabz.fellowshipprogram.oops.clinique.model;

public class Patients {
	public int pId;
	public String pName;
	public int pAge;
	public String mobileNumber;

	public Patients(int pId, String pName, int pAge, String mobileNumber) {

		this.pId = pId;
		this.pName = pName;
		this.pAge = pAge;
		this.mobileNumber = mobileNumber;
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getpAge() {
		return pAge;
	}

	public void setpAge(int pAge) {
		this.pAge = pAge;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

}
