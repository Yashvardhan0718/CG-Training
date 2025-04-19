import java.util.*;
import java.util.stream.*;

class Sale {
    String productId;
    int quantity;
    double price;

    public Sale(String productId, int quantity, double price) {
        this.productId = productId;
        this.quantity = quantity;
        this.price = price;
    }
}

class ProductSales {
    String productId;
    double totalRevenue;

    public ProductSales(String productId, double totalRevenue) {
        this.productId = productId;
        this.totalRevenue = totalRevenue;
    }

    public String toString() {
        return productId + " - $" + totalRevenue;
    }
}

public class ProductSalesAnalysis {

    public static void main(String[] args) {
        List<Sale> sales = Arrays.asList(
            new Sale("P001", 5, 100),
            new Sale("P002", 20, 50),
            new Sale("P003", 15, 80),
            new Sale("P004", 8, 200),
            new Sale("P005", 12, 150),
            new Sale("P006", 30, 10),
            new Sale("P007", 25, 60),
            new Sale("P008", 11, 90),
            new Sale("P009", 40, 20),
            new Sale("P010", 10, 120)
        );

        List<ProductSales> topProducts = sales.stream()
            .filter(s -> s.quantity > 10)
            .collect(Collectors.groupingBy(
                s -> s.productId,
                Collectors.summingDouble(s -> s.quantity * s.price)
            ))
            .entrySet().stream()
            .map(e -> new ProductSales(e.getKey(), e.getValue()))
            .sorted((a, b) -> Double.compare(b.totalRevenue, a.totalRevenue))
            .limit(5)
            .collect(Collectors.toList());

        topProducts.forEach(System.out::println);
    }
}
