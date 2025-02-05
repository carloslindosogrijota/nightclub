package uax.oop.nightclub.models;
public class Table {
    private int tableId;
    private int capacity;
    private boolean isVip;
    private boolean isAvailable;
    private ArrayList<Guest> guestTablesReserved;
    private ArrayList<Order> ordersOfTable;
    public Table(int tableId, int capacity, boolean isVip, boolean isAvailable) {
        this.tableId = tableId;
        this.capacity = capacity;
        this.isVip = isVip;
        this.isAvailable = isAvailable;
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
    public boolean isVip() {
        return isVip;
    }
    public void setVip(boolean isVip) {
        this.isVip = isVip;
    }
    public boolean isAvailable() {
        return isAvailable;
    }
    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
    @Override
    public String toString() {
        return "Table [tableId=" + tableId + ", capacity=" + capacity + ", isVip=" + isVip + ", isAvailable="
                + isAvailable + "]";
    }
    
}
