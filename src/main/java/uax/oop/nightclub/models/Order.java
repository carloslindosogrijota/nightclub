package uax.oop.nightclub.models;
public class Order {
    private int orderId;
    private Table table;
    private String item;
    private double totalPrice;
    public Order(int orderId, Table table, String item, double totalPrice) {
        this.orderId = orderId;
        this.table = table;
        this.item = item;
        this.totalPrice = totalPrice;
    }
    public int getOrderId() {
        return orderId;
    }
    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }
    public Table getTable() {
        return table;
    }
    public void setTable(Table table) {
        this.table = table;
    }
    public String getItem() {
        return item;
    }
    public void setItem(String item) {
        this.item = item;
    }
    public double getTotalPrice() {
        return totalPrice;
    }
    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
    @Override
    public String toString() {
        return "Order [orderId=" + orderId + ", table=" + table + ", item=" + item + ", totalPrice=" + totalPrice + "]";
    }
    
}
