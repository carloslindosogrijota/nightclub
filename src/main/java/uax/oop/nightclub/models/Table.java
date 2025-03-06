package uax.oop.nightclub.models;

import java.util.ArrayList;

public class Table {
    private int tableId;
    private int capacity;
    private int capacityLimity;
    private boolean isVip;
    private boolean isAvailable;
    private ArrayList<Guest> guestTablesReserved;
    private ArrayList<Order> ordersOfTable;

    public Table(int capacity, int capacityLimity, ArrayList<Guest> guestTablesReserved, boolean isAvailable,
            boolean isVip, ArrayList<Order> ordersOfTable, int tableId) {
        this.capacity = capacity;
        this.capacityLimity = capacityLimity;
        this.guestTablesReserved = guestTablesReserved;
        this.isAvailable = isAvailable;
        this.isVip = isVip;
        this.ordersOfTable = ordersOfTable;
        this.tableId = tableId;
    }

    public int getTableId() {
        return tableId;
    }

    public void setTableId(int tableId) {
        this.tableId = tableId;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacityLimity() {
        return capacityLimity;
    }

    public void setCapacityLimity(int capacityLimity) {
        this.capacityLimity = capacityLimity;
    }

    public boolean isIsVip() {
        return isVip;
    }

    public void setIsVip(boolean isVip) {
        this.isVip = isVip;
    }

    public boolean isIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public ArrayList<Guest> getGuestTablesReserved() {
        return guestTablesReserved;
    }

    public void setGuestTablesReserved(ArrayList<Guest> guestTablesReserved) {
        this.guestTablesReserved = guestTablesReserved;
    }

    public ArrayList<Order> getOrdersOfTable() {
        return ordersOfTable;
    }

    public void setOrdersOfTable(ArrayList<Order> ordersOfTable) {
        this.ordersOfTable = ordersOfTable;
    }

    @Override
    public String toString() {
        return "Table [tableId=" + tableId + ", capacity=" + capacity + ", capacityLimity=" + capacityLimity
                + ", isVip=" + isVip + ", isAvailable=" + isAvailable + ", guestTablesReserved=" + guestTablesReserved
                + ", ordersOfTable=" + ordersOfTable + "]";
    }
}
