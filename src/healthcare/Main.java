package healthcare;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== HEALTHCARE SYSTEM ===");

        // CREATE (INSERT)
        PatientDAO.addPatient("Aisamal", 18);
        PatientDAO.addPatient("Eldiyar", 20);

        // UPDATE
        PatientDAO.updatePatientAge(1, 25);

        // DELETE (appointment жоқ user)
        PatientDAO.deletePatient(6);

        // READ (SHOW ALL)
        PatientDAO.showPatients();
    }
}
