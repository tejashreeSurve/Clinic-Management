package com.bridgelabz.fellowshipprogram.oops.clinique.model;

public class AvalabilityOfDoctor {
	int InTime;
	String amOrpm;
	int OutTime;
	String pmOram;
	String Date;

	public AvalabilityOfDoctor(int inTime, String amOrpm, int outTime, String pmOram, String date) {
		InTime = inTime;
		this.amOrpm = amOrpm;
		OutTime = outTime;
		this.pmOram = pmOram;
		Date = date;
	}

	public int getInTime() {
		return InTime;
	}

	public void setInTime(int inTime) {
		InTime = inTime;
	}

	public String getAmOrpm() {
		return amOrpm;
	}

	public void setAmOrpm(String amOrpm) {
		this.amOrpm = amOrpm;
	}

	public int getOutTime() {
		return OutTime;
	}

	public void setOutTime(int outTime) {
		OutTime = outTime;
	}

	public String getPmOram() {
		return pmOram;
	}

	public void setPmOram(String pmOram) {
		this.pmOram = pmOram;
	}

	public String getDate() {
		return Date;
	}

	public void setDate(String date) {
		Date = date;
	}
}
