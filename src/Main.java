/**
 * Main class to demonstrate the Observer pattern with an Order, PriceObserver, and QuantityObserver.
 */
public class Main {
    public static void main(String[] args) {
        Order order = new Order("1");
        OrderObserver priceObserver = new PriceObserver();
        OrderObserver quantityObserver = new QuantityObserver();
        
        order.attach(priceObserver);
        order.attach(quantityObserver);
        
        System.out.println("\n---------------------------------------------------------------\n");
        System.out.println("                       E-COMMERCE-APPLICATION");
        System.out.println("\n---------------------------------------------------------------\n");

        addItemToOrder(order, 50.0);
        addItemToOrder(order, 60.0);
        addItemToOrder(order, 70.0);
        addItemToOrder(order, 30.0);
        addItemToOrder(order, 20.0);
        addItemToOrder(order, 10.0);
        
        System.out.println("\n\n-> Final Order Summary:");
        System.out.println(order);

        System.out.println("\n---------------------------------------------------------------\n");
    }

    private static void addItemToOrder(Order order, double price) {
        System.out.println("\nAdding item to order with price: $" + price);
        order.addItem(price);
        // System.out.println("Current Order State:");
        // System.out.println(order);
    }
}
