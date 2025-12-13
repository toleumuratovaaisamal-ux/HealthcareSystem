
public class Main {
    public static void main(String[] args) {

        Patient p1 = new Patient("Айсамал Төлеумұратова", 19, true);
        MedicalProfessional d1 =
                new MedicalProfessional("Dr. Ali", "Cardiologist", 10);
        Hospital h1 = new Hospital("City Hospital", 150);

        p1.printInfo();
        d1.printInfo();
        h1.printInfo();
    }
}
