package com.bridgelabz.fellowshipprogram.oops.clinique.model;

public class Doctor {
	int docId;
	String docName;
	String docSpecialization;
	AvalabilityOfDoctor available;
	int noOfPatient;

	public Doctor(int docId, String docName, String docSpecialization, AvalabilityOfDoctor available, int noOfPatient) {
		this.docId = docId;
		this.docName = docName;
		this.docSpecialization = docSpecialization;
		this.available = available;
		this.noOfPatient = noOfPatient;
	}

	public int getDocId() {
		return docId;
	}

	public void setDocId(int docId) {
		this.docId = docId;
	}

	public String getDocName() {
		return docName;
	}

	public void setDocName(String docName) {
		this.docName = docName;
	}

	public String getDocSpecialization() {
		return docSpecialization;
	}

	public void setDocSpecialization(String docSpecialization) {
		this.docSpecialization = docSpecialization;
	}

	public AvalabilityOfDoctor getAvailable() {
		return available;
	}

	public void setAvailable(AvalabilityOfDoctor available) {
		this.available = available;
	}

	public int getNoOfPatient() {
		return noOfPatient;
	}

	public void setNoOfPatient(int noOfPatient) {
		this.noOfPatient = noOfPatient;
	}
}
