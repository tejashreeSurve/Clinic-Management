package com.bridgelabz.fellowshipprogram.oops.clinique.model;

public class Appointment {
int appoiId;
int patientid;
int doctorid;
String doctName;
String availablity;
String patientName;
String mobileNumber;

public Appointment(int appoiId, int patientid, int doctorid, String doctName, String availablity, String patientName,
		String mobileNumber) {
	
	this.appoiId = appoiId;
	this.patientid = patientid;
	this.doctorid = doctorid;
	this.doctName = doctName;
	this.availablity = availablity;
	this.patientName = patientName;
	this.mobileNumber = mobileNumber;
}
public int getAppoiId() {
	return appoiId;
}
public void setAppoiId(int appoiId) {
	this.appoiId = appoiId;
}
public int getPatientid() {
	return patientid;
}
public void setPatientid(int patientid) {
	this.patientid = patientid;
}
public int getDoctorid() {
	return doctorid;
}
public void setDoctorid(int doctorid) {
	this.doctorid = doctorid;
}
public String getDoctName() {
	return doctName;
}
public void setDoctName(String doctName) {
	this.doctName = doctName;
}
public String getAvailablity() {
	return availablity;
}
public void setAvailablity(String availablity) {
	this.availablity = availablity;
}
public String getPatientName() {
	return patientName;
}
public void setPatientName(String patientName) {
	this.patientName = patientName;
}
public String getMobileNumber() {
	return mobileNumber;
}
public void setMobileNumber(String mobileNumber) {
	this.mobileNumber = mobileNumber;
}

}
