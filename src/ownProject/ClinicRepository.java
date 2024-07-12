package ownProject;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.sun.scenario.effect.impl.prism.PrMergePeer;

public class ClinicRepository {
	
	private Connection con;
	private Statement stmt;
	
	public ClinicRepository() {
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ownproject", "root", "");
			stmt = con.createStatement();
			
		} catch (SQLException e) {
			System.out.println("Connection error... " + e.getMessage());
		}
	}

	public void close() {
		try {
			if (stmt != null) {
				stmt.close();
			}
			if (con != null) {
				con.close();
			}
		} catch (SQLException e) {
			System.out.println("Connection error... " + e.getMessage());
		}
	}
	
	public void addPatient(Patient patient) {
		
		String query = "INSERT INTO patient(patient_name, patient_birthdate, patient_birthplace, blood_type, allergy, patient_gender, alcohol, cigarette, patient_address) "
				+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

		try {
			PreparedStatement prstmt = con.prepareStatement(query);
			prstmt.setString(1, patient.getPatientName());
			prstmt.setDate(2, Date.valueOf(patient.getPatientBirthDate()));
			prstmt.setString(3, patient.getPatientBirthPlace());
			prstmt.setString(4, patient.getBloodType());
			prstmt.setBoolean(5, patient.isAllergy());
			prstmt.setString(6, patient.getPatientGender());
			prstmt.setBoolean(7, patient.isAlcohol());
			prstmt.setBoolean(8, patient.isCigarette());
			prstmt.setString(9, patient.getPatientAddress());
			prstmt.executeUpdate();
			prstmt.close();
			con.close();
		} catch (SQLException e) {
			System.out.println("Error occurred..." + e.getMessage());
		}
	}
	
	public void addMedicine(Medicine medicine) {
		
		String query = "INSERT INTO medicine(medicine_id, prescription, medicine_dosage, last_seen, expire_date, date, illness, medicine)"
				+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
		
		try {
			PreparedStatement prstmt = con.prepareStatement(query);
			prstmt.setInt(1, medicine.getMedicineId());
			prstmt.setBoolean(2, medicine.isPrescription());
			prstmt.setString(3, medicine.getMedicineDosage());
			prstmt.setDate(4, Date.valueOf(medicine.getLastSeen()));
			prstmt.setDate(5, Date.valueOf(medicine.getExpireDate()));
			prstmt.setDate(6, Date.valueOf(medicine.getDate()));
			prstmt.setString(7, medicine.getIllness());
			prstmt.setString(8, medicine.getMedicine());
			prstmt.executeUpdate();
			prstmt.close();
			con.close();
		} catch (SQLException e) {
			System.out.println("Error occurred..." + e.getMessage());
		}
	}
	
	public List<Medicine> medicineByPatient(Patient patient) {
		
		String query = "";

		return null;
	}
	
	public List<Medicine> requiredPrescription() {
		
		String query = "SELECT medicine_id, medicine FROM medicine WHERE prescription = 1";

		return null;
	}
	
	public List<Medicine> expiredMedicines() {
		
		String query = "SELECT p.patient_id, p.patient_name, p.patient_birthdate, m.expire_date FROM patient p JOIN clinic c ON p.patient_id = c.patient_id" + 
				"JOIN medicine m ON m.medicine_id = c.medicine_id WHERE m.expire_date < (SELECT DATE_ADD(CURRENT_DATE, INTERVAL 7 day))";

		return null;
	}
	
	public List<Patient> olderThan60() {

		return null;
	}
	
	public List<Patient> smokingPatient() {
		
		String query = "SELECT patient_id, patient_name FROM patient WHERE cigarette = 1";

		return null;
	}
}