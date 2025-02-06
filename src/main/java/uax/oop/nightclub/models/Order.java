package uax.oop.nightclub.models;

public class Order {
    private int orderId;
    private String item;
    private double totalPrice;

    public Order(int orderId, String item, double totalPrice) {
        this.orderId = orderId;
        this.item = item;
        this.totalPrice = totalPrice;
    }

    public int getOrderId() {
        return orderId;
    }
    public void setOrderId(int orderId) {
        this.orderId = orderId;
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
        return "Order [orderId=" + orderId + ", item=" + item + ", totalPrice=" + totalPrice + "]";
    }
}
