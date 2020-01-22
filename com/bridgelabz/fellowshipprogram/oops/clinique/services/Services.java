package com.bridgelabz.fellowshipprogram.oops.clinique.services;

import java.util.ArrayList;
import java.util.Scanner;

import com.bridgelabz.fellowshipprogram.oops.clinique.model.Appointment;
import com.bridgelabz.fellowshipprogram.oops.clinique.model.AppointmentList;
import com.bridgelabz.fellowshipprogram.oops.clinique.model.AvalabilityOfDoctor;
import com.bridgelabz.fellowshipprogram.oops.clinique.model.Doctor;
import com.bridgelabz.fellowshipprogram.oops.clinique.model.DoctorList;
import com.bridgelabz.fellowshipprogram.oops.clinique.model.Patients;
import com.bridgelabz.fellowshipprogram.oops.clinique.model.PatientsList;
import com.bridgelabz.fellowshipprogram.oops.clinique.repository.JsonOperation;
import com.bridgelabz.fellowshipprogram.oops.clinique.utility.Utility;

/**
 * @author Tejashree Surve 
 * Purpose: This class contains All logical methods of clinic Management System
 */        
 
public class Services {

	static ArrayList<Patients> listOfPatient = new ArrayList<Patients>();
	static ArrayList<Doctor> listOfDoctor = new ArrayList<Doctor>();
	static ArrayList<Appointment> listOfAppoint = new ArrayList<Appointment>();
	static PatientsList pList = new PatientsList();
	static DoctorList dlist = new DoctorList();
	static AppointmentList alist = new AppointmentList();
	static boolean found;
	static boolean status;
	static Scanner scanner = new Scanner(System.in);
	static JsonOperation operation = new JsonOperation();
	static Utility utility = new Utility();

	/**
	 * Purpose: This method add patients in patientsList
	 */
	public static void addPatients() {
		System.out.println("--------Add New Patients--------\n");
		System.out.println("Enter patients id\n");
		int id = utility.integerValue();
		System.out.println("Enter patients Name\n");
		String pname = Utility.stringValue();
		System.out.println("Enter Age\n");
		int age = utility.integerValue();
		System.out.println("Enter mobileNUmber\n");
		String number = Utility.stringValue();
		status = Utility.phoneNumberValidation(number);
		if (status == true) {
			listOfPatient.add(new Patients(id, pname, age, number));
			pList.setpList(listOfPatient);
			System.out.println("Patient Record is Successfully Added\n");
		} else
			System.out.println("Please Enter Valide Phone-Number");
	}

	/**
	 * Purpose: This method add Doctors in DoctorList And Set the list of doctor
	 */
	public static void addDoctor() {
		System.out.println("---------Add New Doctor----------\n");
		System.out.println("Enter doctor id\n");
		int did = utility.integerValue();
		System.out.println("Enter doctor Name\n");
		String dname = Utility.stringValue();
		System.out.println("Enter Doctor Specilization\n");
		String dspec = Utility.stringValue();
		System.out.println("Enter in-time \n");
		int timein = utility.integerValue();
		System.out.println("Enter AM or PM\n");
		String inAmOrPm = utility.toString();
		System.out.println("Enter out-time\n");
		int timeout = utility.integerValue();
		System.out.println("Enter AM or PM\n");
		String outAmOrPm = utility.toString();
		System.out.println("Enter date of Availibity in format dd/mm/yyyy \n");
		String date = Utility.stringValue();
		status = Utility.dateValidation(date);
		if (status == true) {
			System.out.println("Enter number of Patients\n");
			int noOfPatients = utility.integerValue();
			listOfDoctor.add(new Doctor(did, dname, dspec,
					new AvalabilityOfDoctor(timein, inAmOrPm, timeout, outAmOrPm, date), noOfPatients));
			dlist.setdList(listOfDoctor);
			System.out.println("Doctor Record is Successfully Added\n");
		} else {
			System.out.println("Please Enter Valide Date");
		}
	}

	/**
	 * Purpose: This method search patient by patient name from records
	 */
	public static void searchPatientsByName() {
		System.out.println("Enter Patient Name For Search\n");
		String SearchName = Utility.stringValue();
		found = false;
		for (int i = 0; i < listOfPatient.size(); i++) {
			if ((listOfPatient.get(i).getpName()).equals(SearchName)) {
				found = true;
				System.out.println("-----Patient Details Search By Name-------\n");
				System.out.println("Patient Id-->" + listOfPatient.get(i).getpId());
				System.out.println("Patient Name-->" + listOfPatient.get(i).getpName());
				System.out.println("Patient Age-->" + listOfPatient.get(i).getpAge());
				System.out.println("Patient Mobile-Number--->" + listOfPatient.get(i).mobileNumber);
			}
		}
		if (found == false) {
			System.out.println("Patients Not found\n");
		}
	}

	/**
	 * Purpose: This method search patient by patients id from records
	 */
	public static void searchPatientsById() {
		System.out.println("Enter Patient Id For Search\n");
		int searchId = utility.integerValue();
		found = false;
		for (int i = 0; i < listOfPatient.size(); i++) {
			if ((listOfPatient.get(i).getpId()) == searchId) {
				found = true;
				System.out.println("-----Patients Details Search By Id-------\n");
				System.out.println("Patient Id-->" + listOfPatient.get(i).getpId());
				System.out.println("Patient Name-->" + listOfPatient.get(i).getpName());
				System.out.println("Patient Age-->" + listOfPatient.get(i).getpAge());
				System.out.println("Patient Mobile-Number--->" + listOfPatient.get(i).mobileNumber);
			}
		}
		if (found == false) {
			System.out.println("Patients Not found\n");
		}
	}

	/**
	 * Purpose: This method search patient by patient Mobile-Number from records
	 */
	public static void searchPatientByMobile() {
		System.out.println("Enter Patient Mobile-Number for Search\n");
		String mobileNoSearch = Utility.stringValue();
		status = Utility.phoneNumberValidation(mobileNoSearch);
		if (status == true) {
			found = false;
			for (int i = 0; i < listOfPatient.size(); i++) {
				if ((listOfPatient.get(i).getMobileNumber()).equals(mobileNoSearch)) {
					found = true;
					System.out.println("-----Patients Details Search By MobileNumber-------\n");
					System.out.println("Patient Id-->" + listOfPatient.get(i).getpId());
					System.out.println("Patient Name-->" + listOfPatient.get(i).getpName());
					System.out.println("Patient Age-->" + listOfPatient.get(i).getpAge());
					System.out.println("Patient MobileNumber--->" + listOfPatient.get(i).mobileNumber);
				}
			}
			if (found == false) {
				System.out.println("Patients Not found\n");
			}
		} else {
			System.out.println("Please Enter valide Phone-Number");
		}

	}

	/**
	 * Purpose: This method search Doctor by Doctor Name from records
	 */
	public static void searchDoctorByName() {
		System.out.println("Enter Doctor Name For Search\n");
		String docName = Utility.stringValue();
		found = false;
		for (int i = 0; i < listOfDoctor.size(); i++) {
			if ((listOfDoctor.get(i).getDocName()).equals(docName)) {
				found = true;
				System.out.println("-----Doctor Details Search By DoctorName-------\n");
				System.out.println("Doctor Id-->" + listOfDoctor.get(i).getDocId());
				System.out.println("Doctor Name-->" + listOfDoctor.get(i).getDocName());
				System.out.println("Doctor Specialization-->" + listOfDoctor.get(i).getDocSpecialization());
				System.out.println("Doctor Availability--->" + listOfDoctor.get(i).getAvailable().getDate() + "  "
						+ listOfDoctor.get(i).getAvailable().getInTime()
						+ listOfDoctor.get(i).getAvailable().getAmOrpm() + "-"
						+ listOfDoctor.get(i).getAvailable().getOutTime()
						+ listOfDoctor.get(i).getAvailable().getPmOram());
				System.out.println("Number Of Patient-->" + listOfDoctor.get(i).getNoOfPatient());
			}
		}
		if (found == false) {
			System.out.println("Doctor Not found\n");
		}
	}

	/**
	 * Purpose: This method search Doctor By Doctor Id from records
	 */
	public static void searchDoctorById() {
		System.out.println("Enter Doctor ID for Search\n");
		int docID = utility.integerValue();
		found = false;
		for (int i = 0; i < listOfDoctor.size(); i++) {
			if ((listOfDoctor.get(i).getDocId()) == docID) {
				found = true;
				System.out.println("-----Doctor Details Search By DoctorID-------\n");
				System.out.println("Doctor Id-->" + listOfDoctor.get(i).getDocId());
				System.out.println("Doctor Name-->" + listOfDoctor.get(i).getDocName());
				System.out.println("Doctor Specialization-->" + listOfDoctor.get(i).getDocSpecialization());
				System.out.println("Doctor Availability--->" + listOfDoctor.get(i).getAvailable().getDate() + "  "
						+ listOfDoctor.get(i).getAvailable().getInTime()
						+ listOfDoctor.get(i).getAvailable().getAmOrpm() + "-"
						+ listOfDoctor.get(i).getAvailable().getOutTime()
						+ listOfDoctor.get(i).getAvailable().getPmOram());
				System.out.println("Number Of Patient-->" + listOfDoctor.get(i).getNoOfPatient());
			}
		}
		if (found == false) {
			System.out.println("Doctor Not found\n");
		}

	}

	/**
	 * Purpose:This method search Doctor By Doctor specialization
	 */
	public static void searchDoctorBySpecilization() {
		System.out.println("Enter Doctor Specialization\n");
		String spec = Utility.stringValue();
		found = false;
		for (int i = 0; i < listOfDoctor.size(); i++) {
			if ((listOfDoctor.get(i).getDocSpecialization()).equals(spec)) {
				found = true;
				System.out.println("-----Doctor Details Search By Specialization-------\n");
				System.out.println("Doctor Id-->" + listOfDoctor.get(i).getDocId());
				System.out.println("Doctor Name-->" + listOfDoctor.get(i).getDocName());
				System.out.println("Doctor Specialization-->" + listOfDoctor.get(i).getDocSpecialization());
				System.out.println("Doctor Availability--->" + listOfDoctor.get(i).getAvailable().getDate() + "  "
						+ listOfDoctor.get(i).getAvailable().getInTime()
						+ listOfDoctor.get(i).getAvailable().getAmOrpm() + "-"
						+ listOfDoctor.get(i).getAvailable().getOutTime()
						+ listOfDoctor.get(i).getAvailable().getPmOram());
				System.out.println("Number Of Patient-->" + listOfDoctor.get(i).getNoOfPatient());
			}
		}
		if (found == false) {
			System.out.println("Doctor Not found\n");
		}
	}

	/**
	 * Purpose: This method search Doctor By Doctor Availability
	 */
	public static void searchDoctorByAvailibity() {
		System.out.println("Enter Doctor Availibility date \n");
		String date = Utility.stringValue();
		status = Utility.dateValidation(date);
		if (status = true) {
			System.out.println("Enter Doctor In Time\n");
			int Itime = utility.integerValue();
			System.out.println("Enter Doctor Out Time\n");
			int Otime = utility.integerValue();
			found = false;
			for (int i = 0; i < listOfDoctor.size(); i++) {
				if (((listOfDoctor.get(i).getAvailable().getDate()).equals(date))
						&& ((listOfDoctor.get(i).getAvailable().getInTime()) == Itime)
						&& ((listOfDoctor.get(i).getAvailable().getOutTime()) == Otime)) {
					found = true;
					System.out.println("-----Doctor Details Search By Specialization-------\n");
					System.out.println("Doctor Id-->" + listOfDoctor.get(i).getDocId());
					System.out.println("Doctor Name-->" + listOfDoctor.get(i).getDocName());
					System.out.println("Doctor Specialization-->" + listOfDoctor.get(i).getDocSpecialization());
					System.out.println("Doctor Availability--->" + listOfDoctor.get(i).getAvailable().getDate() + "  "
							+ listOfDoctor.get(i).getAvailable().getInTime()
							+ listOfDoctor.get(i).getAvailable().getAmOrpm() + "-"
							+ listOfDoctor.get(i).getAvailable().getOutTime()
							+ listOfDoctor.get(i).getAvailable().getPmOram());
					System.out.println("Number Of Patient-->" + listOfDoctor.get(i).getNoOfPatient());
				}
			}
			if (found == false) {
				System.out.println("Doctor Not found\n");
			}
		} else {
			System.out.println("Please Enter Valide Date");
		}
	}

	/**
	 * Purpose: This method book Appointment of patients
	 */
	public static void bookAppointment() {
		System.out.println("Enter patients id\n");
		int id = utility.integerValue();
		found = false;
		boolean docfoundSpec = false;
		boolean noOfPatients = false;

		for (int i = 0; i < listOfPatient.size(); i++) // check weather patients id is present or not
		{
			if ((listOfPatient.get(i).getpId()) == id) // if present then proceed
			{
				found = true;
				String patname = listOfPatient.get(i).getpName(); // get patient name
				String patno = listOfPatient.get(i).getMobileNumber(); // get patient mobile number
				System.out.println("Enter Doctor Specialization\n");
				String docspe = Utility.stringValue();

				for (int j = 0; j < listOfDoctor.size(); j++) // check for doctor specialization is present
				{
					if ((listOfDoctor.get(j).getDocSpecialization()).equals(docspe)) // if present then proceed
					{
						docfoundSpec = true;
						int docid = listOfDoctor.get(j).getDocId(); // get doctor id
						String docname = listOfDoctor.get(j).getDocName(); // get doctor name

						if ((listOfDoctor.get(j).getNoOfPatient()) < 5) // check if noOfPatients <5 if yes the proceed
						{
							noOfPatients = true;
							String apDate = listOfDoctor.get(j).getAvailable().getDate();
							System.out.println("Available Date --->" + apDate);
							System.out.println("Press Yes-->Proccesed ");
							String choise = scanner.next().toLowerCase();
							String yes = "yes";
							if (choise.equals(yes)) // if user want to proceed
							{
								System.out.println("Enter time \n");
								int time = utility.integerValue();

								if ((time >= listOfDoctor.get(j).getAvailable().getInTime())
										&& (time < listOfDoctor.get(j).getAvailable().getOutTime())) // check weather
								{
									int apid = id + docid;
									int numberOfPat = listOfDoctor.get(j).getNoOfPatient();
									numberOfPat = numberOfPat + 1;
									listOfDoctor.get(j).setNoOfPatient(numberOfPat);
									dlist.setdList(listOfDoctor);
									listOfAppoint
											.add(new Appointment(apid, id, docid, docname, apDate, patname, patno));
									alist.setAppointList(listOfAppoint); // book Appointment
									System.out.println("Your Appointment is Booked\n");
								} else {
									System.out.println("Sorry! No time Available\n");
								}
							} else {
								System.out.println("Thank-you for your time\n ");
							}
						} else {
							System.out.println("Sorry! Number of Patients is Exceed\n");
						}
					}
				}
			}
		}
		if (found == false)
			System.out.println("Patients not Found\n");
		if (docfoundSpec == false)
			System.out.println("Doctor with such specialization  not Found\n");

	}

	/**
	 * Purpose: This method print Doctor Records
	 */
	public static void printDoctorRecords() {
		System.out.println(
				"Doctor Id\t\tDoctor Name\t\tDoctor Specialization\t\tDoctor In-Out Time\t\tAvailable Date\t\tNoOfPatients\n");
		for (int i = 0; i < listOfDoctor.size(); i++) {
			System.out.println(i + 1 + "." + listOfDoctor.get(i).getDocId() + "\t\t" + listOfDoctor.get(i).getDocName()
					+ "\t\t" + listOfDoctor.get(i).getDocSpecialization() + "\t\t"
					+ listOfDoctor.get(i).getAvailable().getInTime() + listOfDoctor.get(i).getAvailable().getAmOrpm()
					+ "-" + listOfDoctor.get(i).getAvailable().getOutTime()
					+ listOfDoctor.get(i).getAvailable().getPmOram() + "\t\t"
					+ listOfDoctor.get(i).getAvailable().getDate() + "\t\t" + listOfDoctor.get(i).getNoOfPatient());
		}
	}

	/**
	 * Purpose: This method print Patients Records
	 */
	public static void printPatientsRecords() {
		System.out.println("Patient Id\t\tPatient Name\t\tPatient Age\t\tPatient Mobile-Number\n");
		for (int i = 0; i < listOfPatient.size(); i++) {
			System.out.println(i + 1 + "." + listOfPatient.get(i).getpId() + "\t\t" + listOfPatient.get(i).getpName()
					+ "\t\t" + listOfPatient.get(i).getpAge() + "\t\t" + listOfPatient.get(i).getMobileNumber());
		}
	}

	/**
	 * Purpose: This method save Patients Records in json file
	 */
	public static void savePatientsRecord() {
		String filepath = "/home/admin1/Desktop/BridgeLabzPrograms/JsonProject/src/com/bridgelabz/fellowshipprogram/oops/clinique/patientsData.json";
		operation.toWriteIntoFile(filepath, pList);
		System.out.println("patients records is successfully save\n");
	}

	/**
	 * Purpose: This method save Doctors Records in json file
	 */
	public static void saveDoctorsRecord() {
		String filepath = "/home/admin1/Desktop/BridgeLabzPrograms/JsonProject/src/com/bridgelabz/fellowshipprogram/oops/clinique/DoctorData.json";
		operation.toWriteIntoFile(filepath, dlist);
		System.out.println("Doctor records is successfully save\n");
	}

	/**
	 * Purpose: This method save Appointment Records in json file
	 */
	public static void saveAppointmentRecord() {
		String filepath = "/home/admin1/Desktop/BridgeLabzPrograms/JsonProject/src/com/bridgelabz/fellowshipprogram/oops/clinique/appointmentDate.json";
		operation.toWriteIntoFile(filepath, alist);
		System.out.println("Appointmtnt records is successfully save\n");
	}

	/**
	 * Purpose: This method show popular Doctor of Clinic
	 */
	public static void popularDoctor() {
		System.out.println("Doctor Id\t\tDoctor Name\t\tDoctor Specialization\t\tNoOfPatients\n");
		for (int i = 0; i < listOfDoctor.size(); i++) {
			if ((listOfDoctor.get(i).getNoOfPatient()) >= 5) {
				System.out.println(i + 1 + "." + listOfDoctor.get(i).getDocId() + "\t\t"
						+ listOfDoctor.get(i).getDocName() + "\t\t" + listOfDoctor.get(i).getDocSpecialization()
						+ "\t\t" + listOfDoctor.get(i).getNoOfPatient());
			}
		}
	}
}
