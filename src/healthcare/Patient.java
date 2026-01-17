public class Patient {
    private String name;
    private int age;
    private boolean admitted;

    public Patient(String name, int age, boolean admitted) {
        this.name = name;
        this.age = age;
        this.admitted = admitted;
    }

    public void printInfo() {
        System.out.println("Patient: " + name + ", Age: " + age +
                ", Admitted: " + admitted);
    }

    // ✅ Overloading
    public void printInfo(String prefix) {
        System.out.println(prefix + " Patient: " + name + ", Age: " + age);
    }

    // ✅ Overloading
    public void printInfo(boolean showStatus) {
        System.out.println("Patient: " + name + ", Age: " + age);
        if (showStatus) {
            System.out.println("Admitted: " + admitted);
        }
    }
}
