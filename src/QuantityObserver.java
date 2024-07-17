public class QuantityObserver implements OrderObserver {
    @Override
    public void update(Order order) {
        System.out.println("QuantityObserver: Order updated - " + order.toString());
    }
}
