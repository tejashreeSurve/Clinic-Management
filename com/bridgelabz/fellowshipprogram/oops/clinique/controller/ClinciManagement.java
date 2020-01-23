
package com.bridgelabz.fellowshipprogram.oops.clinique.controller;

import com.bridgelabz.fellowshipprogram.oops.clinique.services.Services;
import com.bridgelabz.fellowshipprogram.oops.clinique.utility.Utility;

/**
 * @author Tejashree surve 
 * @Purpose: This program is used to manage a list of
 *         Doctors associated with the Clinic. This also manages the list of
 *         patients who use the clinic. This allow user to do list of option.
 */
public class ClinciManagement {
	public static void main(String[] args) {
		Utility utility = new Utility();
		int option = 0;
		System.out.println("---------Wel-Come to ClinciManagement----------\n");

		while (option != 17) {
			System.out.println("Option for Adding Details");
			System.out.println("1.Add New Patients\n");
			System.out.println("2.Add New Doctor\n");
			System.out.println("3.Search Patients By Name\n");
			System.out.println("4.Serach Patients By Id\n");
			System.out.println("5.Search Patients By MobileNumber\n");
			System.out.println("6.Search Doctor By Name\n");
			System.out.println("7.Search Doctor By Id\n");
			System.out.println("8.Search Doctor By Specilization\n");
			System.out.println("9.Search Doctor By Avalilability\n");
			System.out.println("10.Book Doctor Appointment\n");
			System.out.println("11.Print Doctor Report\n");
			System.out.println("12.Print Patients Report\n");
			System.out.println("13.Save Doctor Records\n");
			System.out.println("14.Save Patients Records\n");
			System.out.println("15.Save Appointment Data\n");
			System.out.println("16.Popular Doctor\n");
			System.out.println("17.Exit\n");
			System.out.println("Enter Option\n");
			option = utility.integerValue();
			switch (option) {
			case 1:
				Services.addPatients();
				break;

			case 2:
				Services.addDoctor();
				break;

			case 3:
				Services.searchPatientsByName();
				break;

			case 4:
				Services.searchPatientsById();
				break;

			case 5:
				Services.searchPatientByMobile();
				break;

			case 6:
				Services.searchDoctorByName();
				break;

			case 7:
				Services.searchDoctorById();
				break;

			case 8:
				Services.searchDoctorBySpecilization();
				break;

			case 9:
				Services.searchDoctorByAvailibity();
				break;

			case 10:
				Services.bookAppointment();
				break;

			case 11:
				Services.printDoctorRecords();
				break;

			case 12:
				Services.printPatientsRecords();
				break;

			case 13:
				Services.saveDoctorsRecord();
				break;

			case 14:
				Services.savePatientsRecord();
				break;

			case 15:
				Services.saveAppointmentRecord();
				break;

			case 16:
				Services.popularDoctor();
				break;

			case 17:
				System.out.println("------Thank-you------");
				break;

			default:
				System.out.println("Enter Valide Option\n");
				break;
			}
		}
	}
}
