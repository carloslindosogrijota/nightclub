package uax.oop.nightclub.models;

public class Guest {
    private String dni;
    private String name;
    private int age;
    private boolean hasReservation;
    private Table reservedTables;
    public Guest(int age, String dni, boolean hasReservation, String name, Table reservedTables) {
        this.age = age;
        this.dni = dni;
        this.hasReservation = hasReservation;
        this.name = name;
        this.reservedTables = reservedTables;
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
    public Table getReservedTables() {
        return reservedTables;
    }
    public void setReservedTables(Table reservedTables) {
        this.reservedTables = reservedTables;
    }
    @Override
    public String toString() {
        return "Guest [dni=" + dni + ", name=" + name + ", age=" + age + ", hasReservation=" + hasReservation
                + ", reservedTables=" + reservedTables + "]";
    }
}