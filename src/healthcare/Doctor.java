public class Doctor extends MedicalProfessional {

    private String department;

    public Doctor(String name, String specialty, int experienceYears, String department) {
        super(name, specialty, experienceYears);
        this.department = department;
    }

    // ✅ Overriding
    @Override
    public void printInfo() {
        System.out.println("Doctor: " + getName()
                + ", Specialty: " + getSpecialty()
                + ", Experience: " + getExperienceYears()
                + ", Department: " + department);
    }
}
