/**
 * Concrete observer that applies a discount if the total price exceeds a certain threshold, in our case 200 dollars
 */
public class PriceObserver implements OrderObserver {
    @Override
    public void update(Order order) {
        if (order.getTotalPrice() > 200) {
            double discount = 20.0;
            order.setTotalPrice(order.getTotalPrice() - discount);
            System.out.println("PriceObserver: Applied $20 discount. New total price: " + order.getTotalPrice());
        }
    }
}
