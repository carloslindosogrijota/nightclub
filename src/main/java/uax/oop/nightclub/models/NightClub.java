package uax.oop.nightclub.models;
import java.util.ArrayList;

public class NightClub {
    private ArrayList<Guest> guests;
    private ArrayList<Table> tables;
    private ArrayList<Order> orders;
    public NightClub(ArrayList<Guest> guests, ArrayList<Table> tables, ArrayList<Order> orders) {
        this.guests = guests;
        this.tables = tables;
        this.orders = orders;
    }
    public ArrayList<Guest> getGuests() {
        return guests;
    }
    public void setGuests(ArrayList<Guest> guests) {
        this.guests = guests;
    }
    public ArrayList<Table> getTables() {
        return tables;
    }
    public void setTables(ArrayList<Table> tables) {
        this.tables = tables;
    }
    public ArrayList<Order> getOrders() {
        return orders;
    }
    public void setOrders(ArrayList<Order> orders) {
        this.orders = orders;
    }
    @Override
    public String toString() {
        return "NightClub [guests=" + guests + ", tables=" + tables + ", orders=" + orders + "]";
    }
    
}
