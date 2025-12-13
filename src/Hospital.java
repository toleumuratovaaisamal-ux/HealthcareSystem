public class Hospital {
    String name;
    int capacity;

    public Hospital(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public void printInfo() {
        System.out.println("Hospital: " + name + ", Capacity: " + capacity);
    }
}
