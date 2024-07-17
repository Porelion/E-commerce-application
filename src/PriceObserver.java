public class PriceObserver implements OrderObserver {
    @Override
    public void update(Order order) {
        System.out.println("PriceObserver: Order updated - " + order.toString());
    }
}
