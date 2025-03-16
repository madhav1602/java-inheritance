import java.time.LocalDate;

// Base Class: Order
class Order {
    protected int orderId;
    protected LocalDate orderDate;

    public Order(int orderId, LocalDate orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    public String getOrderStatus() {
        return "Order Placed";
    }

    public void displayOrderDetails() {
        System.out.println("Order ID: " + orderId + ", Date: " + orderDate + ", Status: " + getOrderStatus());
    }
}

// Subclass: ShippedOrder
class ShippedOrder extends Order {
    protected String trackingNumber;

    public ShippedOrder(int orderId, LocalDate orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    public String getOrderStatus() {
        return "Shipped (Tracking No: " + trackingNumber + ")";
    }
}

// Subclass: DeliveredOrder
class DeliveredOrder extends ShippedOrder {
    private LocalDate deliveryDate;

    public DeliveredOrder(int orderId, LocalDate orderDate, String trackingNumber, LocalDate deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    public String getOrderStatus() {
        return "Delivered on " + deliveryDate;
    }
}

// Main Class
public class OrderManagementSystem {
    public static void main(String[] args) {
        // Creating objects for different order stages
        Order order = new Order(101, LocalDate.of(2025, 3, 10));
        ShippedOrder shippedOrder = new ShippedOrder(102, LocalDate.of(2025, 3, 8), "TRK12345");
        DeliveredOrder deliveredOrder = new DeliveredOrder(103, LocalDate.of(2025, 3, 5), "TRK67890", LocalDate.of(2025, 3, 12));

        // Display order details
        order.displayOrderDetails();
        shippedOrder.displayOrderDetails();
        deliveredOrder.displayOrderDetails();
    }
}
