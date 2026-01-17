package healthcare;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== HEALTHCARE SYSTEM ===");

        // ADD
        PatientDAO.addPatient("Aisamal", 18);
        PatientDAO.addPatient("Eldiyar", 20);

        // SHOW
        PatientDAO.showPatients();
    }
}
