public class Main {
    public static void main(String[] args) {

        // 🧍 Patient — Overloading
        Patient p1 = new Patient("Aisamal", 19, true);
        p1.printInfo();
        p1.printInfo("INFO:");
        p1.printInfo(true);

        System.out.println("------------------");

        // 🩺 Overriding + Polymorphism
        MedicalProfessional doc =
                new Doctor("Dr. Ali", "Cardiologist", 10, "Cardio Dept");

        doc.printInfo(); // Doctor-дың printInfo() шақырылады

        System.out.println("------------------");

        Hospital h1 = new Hospital("City Hospital", 150);
        h1.printInfo();
    }
}
