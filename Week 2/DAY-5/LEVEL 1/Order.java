import java.time.LocalDate;
class Order {
    String orderId;
    LocalDate orderDate;

    Order(String orderId, LocalDate orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    String getOrderStatus() {
        return "Order placed";
    }

    void displayOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Order Date: " + orderDate);
    }
}
class ShippedOrder extends Order {
    String trackingNumber;

    ShippedOrder(String orderId, LocalDate orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    String getOrderStatus() {
        return "Order shipped";
    }

    @Override
    void displayOrderDetails() {
        super.displayOrderDetails();
        System.out.println("Tracking Number: " + trackingNumber);
    }
}
class DeliveredOrder extends ShippedOrder {
    LocalDate deliveryDate;

    DeliveredOrder(String orderId, LocalDate orderDate, String trackingNumber, LocalDate deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    String getOrderStatus() {
        return "Order delivered on " + deliveryDate;
    }

    @Override
    void displayOrderDetails() {
        super.displayOrderDetails();
        System.out.println("Delivery Date: " + deliveryDate);
    }
}
class OrderManagementSystem {
    public static void main(String[] args) {
        Order order = new Order("ORD001", LocalDate.of(2025, 4, 1));
        ShippedOrder shipped = new ShippedOrder("ORD002", LocalDate.of(2025, 4, 2), "TRK12345");
        DeliveredOrder delivered = new DeliveredOrder("ORD003", LocalDate.of(2025, 4, 3), "TRK54321", LocalDate.of(2025, 4, 6));

        Order[] orders = {order, shipped, delivered};

        for (Order o : orders) {
            System.out.println("Status: " + o.getOrderStatus());
            o.displayOrderDetails();
            System.out.println("------------");
        }
    }
}

