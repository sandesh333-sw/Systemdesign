
/**
 * ENUMS IN JAVA
 *
 * An enum (enumeration) is a special data type that defines
 * a fixed set of named constants.
 *
 * Unlike strings or integers, enums are type-safe.
 * The compiler ensures that only valid, predefined values
 * can be used.
 *
 * WHY USE ENUMS?
 * 1. Type safety
 * 2. Readability
 * 3. Prevents invalid values
 * 4. Easy maintenance
 * 5. Useful for representing fixed states
 */

// 1. Define an enum
enum OrderStatus {
    PENDING,
    CONFIRMED,
    SHIPPED,
    DELIVERED,
    CANCELLED
}

// 2. Use the enum inside a class
class Order {

    private final int orderId;
    private OrderStatus status;

    public Order(int orderId) {
        this.orderId = orderId;
        this.status = OrderStatus.PENDING;
    }

    public void updateStatus(OrderStatus newStatus) {
        this.status = newStatus;
    }

    public void displayOrder() {
        System.out.println(
            "Order ID: " + orderId +
            " | Status: " + status
        );
    }
}

// 3. Main class
public class Enums {

    public static void main(String[] args) {

        // Accessing enum constants
        OrderStatus status = OrderStatus.PENDING;

        System.out.println("Initial status: " + status);

        // Creating an order
        Order order = new Order(101);
        order.displayOrder();

        // Updating the order status
        order.updateStatus(OrderStatus.CONFIRMED);
        order.displayOrder();

        order.updateStatus(OrderStatus.SHIPPED);
        order.displayOrder();

        order.updateStatus(OrderStatus.DELIVERED);
        order.displayOrder();

        // Comparing enums
        if (status == OrderStatus.PENDING) {
            System.out.println("Order is pending");
        }

        // Iterating through enum constants
        System.out.println("\nAvailable order statuses:");

        for (OrderStatus s : OrderStatus.values()) {
            System.out.println(s);
        }

        // Invalid value: compile-time error
        // order.updateStatus("PROCESSING");
    }
}
