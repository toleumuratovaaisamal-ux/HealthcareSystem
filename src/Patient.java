public class Patient {
    String name;
    int age;
    boolean admitted;

    public Patient(String name, int age, boolean admitted) {
        this.name = name;
        this.age = age;
        this.admitted = admitted;
    }

    public void printInfo() {
        System.out.println("Patient: " + name + ", Age: " + age + ", Admitted: " + admitted);
    }
}
