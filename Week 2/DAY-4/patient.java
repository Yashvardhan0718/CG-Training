class Patient {
 	private String name;
 	private Doctor[] doctors;
 	private int doctorCount;

 	public Patient(String name, int maxDoctors) {
     	this.name = name;
     	this.doctors = new Doctor[maxDoctors];
     	this.doctorCount = 0;
 	}

 	public String getName() {
     	return name;
 	}

 	public void addDoctor(Doctor doctor) {
     	if (doctorCount < doctors.length) {
         	doctors[doctorCount++] = doctor;
     	}
 	}

 	public void showDoctors() {
     	System.out.println("Doctors consulted by " + name + ":");
     	for (int i = 0; i < doctorCount; i++) {
         	System.out.println("  - " + doctors[i].getName());
     	}
 	}
 }

 class Doctor {
 	private String name;
 	private Patient[] patients;
 	private int patientCount;

 	public Doctor(String name, int maxPatients) {
     	this.name = name;
     	this.patients = new Patient[maxPatients];
     	this.patientCount = 0;
 	}

 	public String getName() {
     	return name;
 	}

 	public void consult(Patient patient) {
     	if (patientCount < patients.length) {
         	patients[patientCount++] = patient;
         	patient.addDoctor(this);
         	System.out.println("Doctor " + name + " consulted Patient " + patient.getName());
     	}
 	}

 	public void showPatients() {
     	System.out.println("Patients consulted by Dr. " + name + ":");
     	for (int i = 0; i < patientCount; i++) {
         	System.out.println("  - " + patients[i].getName());
     	}
 	}
 }

 class Hospital {
 	private String hospitalName;
 	private Doctor[] doctors;
 	private Patient[] patients;
 	private int doctorCount;
 	private int patientCount;

 	public Hospital(String hospitalName, int maxDoctors, int maxPatients) {
     	this.hospitalName = hospitalName;
     	this.doctors = new Doctor[maxDoctors];
     	this.patients = new Patient[maxPatients];
     	this.doctorCount = 0;
     	this.patientCount = 0;
 	}

 	public void addDoctor(Doctor doctor) {
     	if (doctorCount < doctors.length) {
         	doctors[doctorCount++] = doctor;
     	}
 	}

 	public void addPatient(Patient patient) {
     	if (patientCount < patients.length) {
         	patients[patientCount++] = patient;
     	}
 	}

 	public void showHospitalInfo() {
     	System.out.println("Hospital: " + hospitalName);
     	System.out.println("Doctors:");
     	for (int i = 0; i < doctorCount; i++) {
         	System.out.println("  - " + doctors[i].getName());
     	}
     	System.out.println("Patients:");
     	for (int i = 0; i < patientCount; i++) {
         	System.out.println("  - " + patients[i].getName());
     	}
 	}
 }

 public class HospitalSystem {
 	public static void main(String[] args) {
     	Hospital hospital = new Hospital("City Care Hospital", 3, 3);

     	Doctor drSmith = new Doctor("Smith", 5);
     	Doctor drJones = new Doctor("Jones", 5);

     	Patient john = new Patient("John", 5);
     	Patient emily = new Patient("Emily", 5);

     	hospital.addDoctor(drSmith);
     	hospital.addDoctor(drJones);
     	hospital.addPatient(john);
     	hospital.addPatient(emily);

     	drSmith.consult(john);
     	drSmith.consult(emily);
     	drJones.consult(emily);

     	hospital.showHospitalInfo();

     	drSmith.showPatients();
     	drJones.showPatients();

     	john.showDoctors();
     	emily.showDoctors();
 	}
 }

