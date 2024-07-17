/**
 * Concrete observer that adjusts the shipping cost based on the quantity of items in the order, inour case 5
 */
public class QuantityObserver implements OrderObserver {
    @Override
    public void update(Order order) {
        if (order.getCount() > 5) {
            order.setShippingCost(0.0);
            System.out.println("QuantityObserver: Set shipping cost to $0. New shipping cost: " + order.getShippingCost());
        } else {
            order.setShippingCost(10.0);
            System.out.println("QuantityObserver: Set shipping cost to $10. New shipping cost: " + order.getShippingCost());
        }
    }
}
