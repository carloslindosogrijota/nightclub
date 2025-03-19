package uax.oop.nightclub.models;

public class Order {
    private int orderId;
    private String item;
    private double price;

    public Order(int orderId, String item, double price) {
        this.orderId = orderId;
        this.item = item;
        this.price = price;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Order [orderId=" + orderId + ", item=" + item + ", price=" + price + "]";
    }
}
