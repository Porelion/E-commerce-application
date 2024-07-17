# E-commerce Order System

## Description

This project implements the Observer design pattern in the context of an e-commerce order system. When an order is updated by adding items, two observers (a PriceObserver and a QuantityObserver) are notified and perform the following actions:

1. If the cost of the order exceeds $200, the PriceObserver applies a $20 discount and updates the order's total price by subtracting the discount amount.
2. If the quantity of items in the order exceeds 5, the QuantityObserver sets the shipping cost of the order to zero, otherwise the default shipping cost is $10.

## Project Structure

The project includes the following classes and interfaces:

- `OrderObserver`: Interface for observers that will be notified of changes in the order.
- `Order`: Class representing an order in the e-commerce application. This class acts as the Observable in the Observer pattern.
- `PriceObserver`: Concrete observer that applies a discount if the total price exceeds a certain threshold.
- `QuantityObserver`: Concrete observer that adjusts the shipping cost based on the quantity of items in the order.
- `Main`: Main class to demonstrate the Observer pattern with an order, a `PriceObserver`, and a `QuantityObserver`.

