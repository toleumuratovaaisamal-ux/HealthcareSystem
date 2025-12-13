public class MedicalProfessional {
    String name;
    String specialization;
    int experience;

    public MedicalProfessional(String name, String specialization, int experience) {
        this.name = name;
        this.specialization = specialization;
        this.experience = experience;
    }

    public void printInfo() {
        System.out.println("Doctor: " + name + ", Specialization: " + specialization +
                ", Experience: " + experience + " years");
    }
}
