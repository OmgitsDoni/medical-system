package ownProject;

import java.time.LocalDate;

public class Patient {
	
	private int patientId;
	private String patientName;
	private LocalDate patientBirthDate;
	private String patientBirthPlace;
	private String bloodType;
	private boolean allergy;
	private String patientGender;
	private boolean alcohol;
	private boolean cigarette;
	private String patientAddress;
	
	public Patient(int patientId, String patientName, LocalDate patientBirthDate, String patientBirthPlace,
			String bloodType, boolean allergy, String patientGender, boolean alcohol, boolean cigarette,
			String patientAddress) {
		this.patientId = patientId;
		this.patientName = patientName;
		this.patientBirthDate = patientBirthDate;
		this.patientBirthPlace = patientBirthPlace;
		this.bloodType = bloodType;
		this.allergy = allergy;
		this.patientGender = patientGender;
		this.alcohol = alcohol;
		this.cigarette = cigarette;
		this.patientAddress = patientAddress;
	}

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public LocalDate getPatientBirthDate() {
		return patientBirthDate;
	}

	public void setPatientBirthDate(LocalDate patientBirthDate) {
		this.patientBirthDate = patientBirthDate;
	}

	public String getPatientBirthPlace() {
		return patientBirthPlace;
	}

	public void setPatientBirthPlace(String patientBirthPlace) {
		this.patientBirthPlace = patientBirthPlace;
	}

	public String getBloodType() {
		return bloodType;
	}

	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}

	public boolean isAllergy() {
		return allergy;
	}

	public void setAllergy(boolean allergy) {
		this.allergy = allergy;
	}

	public String getPatientGender() {
		return patientGender;
	}

	public void setPatientGender(String patientGender) {
		this.patientGender = patientGender;
	}

	public boolean isAlcohol() {
		return alcohol;
	}

	public void setAlcohol(boolean alcohol) {
		this.alcohol = alcohol;
	}

	public boolean isCigarette() {
		return cigarette;
	}

	public void setCigarette(boolean cigarette) {
		this.cigarette = cigarette;
	}

	public String getPatientAddress() {
		return patientAddress;
	}

	public void setPatientAddress(String patientAddress) {
		this.patientAddress = patientAddress;
	}

	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", patientName=" + patientName + ", patientBirthDate="
				+ patientBirthDate + ", patientBirthPlace=" + patientBirthPlace + ", bloodType=" + bloodType
				+ ", allergy=" + allergy + ", patientGender=" + patientGender + ", alcohol=" + alcohol + ", cigarette="
				+ cigarette + ", patientAddress=" + patientAddress + "]";
	}
}