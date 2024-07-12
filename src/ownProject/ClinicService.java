package ownProject;

import java.util.List;

public class ClinicService {

	private ClinicRepository clinicRepository;

	public void addPatient(Patient patient) {
		clinicRepository.addPatient(patient);
	}

	public void addMedicine(Medicine medicine) {
		clinicRepository.addMedicine(medicine);
	}

	public List<Medicine> medicineByPatient(Patient patient) {
		return clinicRepository.medicineByPatient(patient);
	}

	public List<Medicine> requiredPrescription() {
		return clinicRepository.requiredPrescription();
	}

	public List<Medicine> expiredMedicines() {  //gy�gyszer aminek a havi (?) adagol�sa lej�rt
		return clinicRepository.expiredMedicines();
	}

	public List<Patient> olderThan60() {
		return clinicRepository.olderThan60();
	}

	public List<Patient> smokingPatient() {
		return clinicRepository.smokingPatient();
	}
}