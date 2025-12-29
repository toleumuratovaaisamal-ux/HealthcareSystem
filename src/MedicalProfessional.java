public class MedicalProfessional {
    private String name;
    private String specialty;
    private int experienceYears;

    public MedicalProfessional(String name, String specialty, int experienceYears) {
        this.name = name;
        this.specialty = specialty;
        this.experienceYears = experienceYears;
    }

    public String getName() {
        return name;
    }

    public String getSpecialty() {
        return specialty;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public void printInfo() {
        System.out.println("Medical Professional: " + name +
                ", Specialty: " + specialty +
                ", Experience: " + experienceYears + " years");
    }
}
