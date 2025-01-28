package uax.oop.nightclub.models;

public class Guest {
    private String dni;
    private String name;
    private int age;
    private boolean hasReservation;
    public Object se;
    public Guest(String dni, String name, int age, boolean hasReservation) {
        this.dni = dni;
        this.name = name;
        this.age = age;
        this.hasReservation = hasReservation;
    }
    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public boolean isHasReservation() {
        return hasReservation;
    }
    public void setHasReservation(boolean hasReservation) {
        this.hasReservation = hasReservation;
    }
    @Override
    public String toString() {
        return "Guest [dni=" + dni + ", name=" + name + ", age=" + age + ", hasReservation=" + hasReservation + "]";
    }
    
}
