import java.util.ArrayList;
import java.util.List;

/**
 * This class represents an order in this e-commerce application
 * This class acts as the Observable in the Observer pattern
 */

public class Order {
    private String id;
    private List<OrderObserver> observers = new ArrayList<>();
    private double totalPrice = 0.0;
    private int count = 0;
    private double shippingCost = 10.0;

    public Order(String id) {
        this.id = id;
    }

    public void attach(OrderObserver observer) {
        observers.add(observer);
    }

    public void detach(OrderObserver observer) {
        observers.remove(observer);
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public int getCount() {
        return count;
    }

    public double getShippingCost() {
        return shippingCost;
    }

    public void addItem(double price) {
        totalPrice += price;
        count++;
        notifyObservers();
    }

    private void notifyObservers() {
        for (OrderObserver observer : observers) {
            observer.update(this);
        }
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void setShippingCost(double shippingCost) {
        this.shippingCost = shippingCost;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", totalPrice=" + totalPrice +
                ", count=" + count +
                ", shippingCost=" + shippingCost +
                '}';
    }
}
