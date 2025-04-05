class Product {
 	private String name;
 	private double price;

 	public Product(String name, double price) {
     	this.name = name;
     	this.price = price;
 	}

 	public String getName() {
     	return name;
 	}

 	public double getPrice() {
     	return price;
 	}
 }

 class Order {
 	private Product[] products;
 	private int productCount;
 	private Customer customer;

 	public Order(int maxProducts, Customer customer) {
     	this.products = new Product[maxProducts];
     	this.productCount = 0;
     	this.customer = customer;
 	}

 	public void addProduct(Product product) {
     	if (productCount < products.length) {
         	products[productCount++] = product;
     	}
 	}

 	public void showOrderDetails() {
     	System.out.println("Order placed by: " + customer.getName());
     	System.out.println("Products in order:");
     	double total = 0;
     	for (int i = 0; i < productCount; i++) {
         	System.out.println("  - " + products[i].getName() + " ($" + products[i].getPrice() + ")");
         	total += products[i].getPrice();
     	}
     	System.out.println("Total: $" + total);
 	}
 }

 class Customer {
 	private String name;
 	private Order[] orders;
 	private int orderCount;

 	public Customer(String name, int maxOrders) {
     	this.name = name;
     	this.orders = new Order[maxOrders];
     	this.orderCount = 0;
 	}

 	public String getName() {
     	return name;
 	}

 	public void placeOrder(Order order) {
     	if (orderCount < orders.length) {
         	orders[orderCount++] = order;
     	}
 	}

 	public void showOrders() {
     	System.out.println("Orders for " + name + ":");
     	for (int i = 0; i < orderCount; i++) {
             orders[i].showOrderDetails();
     	}
 	}
 }

 public class ECommercePlatform {
 	public static void main(String[] args) {
     	Product phone = new Product("Smartphone", 699.99);
     	Product laptop = new Product("Laptop", 1199.50);
     	Product headphones = new Product("Headphones", 199.99);

     	Customer alice = new Customer("Alice", 3);
     	Customer bob = new Customer("Bob", 3);

     	Order order1 = new Order(5, alice);
     	order1.addProduct(phone);
     	order1.addProduct(headphones);
     	alice.placeOrder(order1);

     	Order order2 = new Order(5, bob);
     	order2.addProduct(laptop);
     	bob.placeOrder(order2);

     	alice.showOrders();
     	bob.showOrders();
 	}
 }