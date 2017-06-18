package com.doctors.TODDSYNDROME;

import android.app.Application;

import com.doctors.TODDSYNDROME.database.Patient;
import com.doctors.TODDSYNDROME.database.PatientDatabaseHelper;

public class MyApp extends Application {
	
	private static PatientDatabaseHelper db;
	private static Patient patientPrivate = null;
	private static PatientSelectionActivity PSA = null;

	public MyApp() {}

	@Override
	public void onCreate() {
		super.onCreate();
//		db = new PatientDatabaseHelper(this);
		
//		Log.d("debug", "just finished making the database, boo yah!");
	}

	
	// Getters and setters

	public static Patient getPatient() {
		return patientPrivate;
	}

	public static void setPatient(Patient patient) {
		patientPrivate = patient;
	}

	public static PatientDatabaseHelper getDb() {
		return db;
	}

	public static void setDb(PatientDatabaseHelper db) {
		MyApp.db = db;
	}

	public static PatientSelectionActivity getPSA() {
		return PSA;
	}

	public static void setPSA(PatientSelectionActivity pSA) {
		PSA = pSA;
	}

}
