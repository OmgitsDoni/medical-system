package ownProject;

import java.time.LocalDate;

public class Medicine {
	
	private int medicineId;
	private boolean prescription;
	private String medicineDosage;
	private LocalDate lastSeen;
	private LocalDate expireDate;
	private LocalDate date;
	private String illness;
	private String medicine;
	
	public Medicine(int medicineId, boolean prescription, String medicineDosage, LocalDate lastSeen,
			LocalDate expireDate, LocalDate date, String illness, String medicine) {
		this.medicineId = medicineId;
		this.prescription = prescription;
		this.medicineDosage = medicineDosage;
		this.lastSeen = lastSeen;
		this.expireDate = expireDate;
		this.date = date;
		this.illness = illness;
		this.medicine = medicine;
	}

	public int getMedicineId() {
		return medicineId;
	}

	public void setMedicineId(int medicineId) {
		this.medicineId = medicineId;
	}

	public boolean isPrescription() {
		return prescription;
	}

	public void setPrescription(boolean prescription) {
		this.prescription = prescription;
	}

	public String getMedicineDosage() {
		return medicineDosage;
	}

	public void setMedicineDosage(String medicineDosage) {
		this.medicineDosage = medicineDosage;
	}

	public LocalDate getLastSeen() {
		return lastSeen;
	}

	public void setLastSeen(LocalDate lastSeen) {
		this.lastSeen = lastSeen;
	}

	public LocalDate getExpireDate() {
		return expireDate;
	}

	public void setExpireDate(LocalDate expireDate) {
		this.expireDate = expireDate;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	public String getIllness() {
		return illness;
	}

	public void setIllness(String illness) {
		this.illness = illness;
	}

	public String getMedicine() {
		return medicine;
	}

	public void setMedicine(String medicine) {
		this.medicine = medicine;
	}

	@Override
	public String toString() {
		return "Medicine [medicineId=" + medicineId + ", prescription=" + prescription + ", medicineDosage="
				+ medicineDosage + ", lastSeen=" + lastSeen + ", expireDate=" + expireDate + ", date=" + date
				+ ", illness=" + illness + ", medicine=" + medicine + "]";
	}
}