package week4.day1.level1;

import java.util.ArrayList;
import java.util.List;

interface Category {
    String getCategoryName();
}

enum BookCategory implements Category {
    FICTION, NONFICTION, SCIENCE;

    public String getCategoryName() {
        return name();
    }
}

enum ClothingCategory implements Category {
    SHIRT, PANTS, JACKET;

    public String getCategoryName() {
        return name();
    }
}

enum GadgetCategory implements Category {
    MOBILE, LAPTOP, TABLET;

    public String getCategoryName() {
        return name();
    }
}

class Product<T extends Category> {
    private String productName;
    private double productPrice;
    private T productCategory;

    public Product(String productName, double productPrice, T productCategory) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productCategory = productCategory;
    }

    public String getProductName() {
        return productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public T getProductCategory() {
        return productCategory;
    }

    public void setProductPrice(double price) {
        this.productPrice = price;
    }
}

class DiscountUtil {
    public static <T extends Product<?>> void applyDiscount(T product, double percentage) {
        double discountAmount = product.getProductPrice() * (percentage / 100);
        product.setProductPrice(product.getProductPrice() - discountAmount);
    }
}

public class Marketplace {
    public static void main(String[] args) {
        List<Product<?>> catalog = new ArrayList<>();

        Product<BookCategory> book = new Product<>("The Alchemist", 400, BookCategory.FICTION);
        Product<ClothingCategory> shirt = new Product<>("Denim Shirt", 1200, ClothingCategory.SHIRT);
        Product<GadgetCategory> phone = new Product<>("Smartphone X", 30000, GadgetCategory.MOBILE);

        catalog.add(book);
        catalog.add(shirt);
        catalog.add(phone);

        DiscountUtil.applyDiscount(book, 10);
        DiscountUtil.applyDiscount(shirt, 15);
        DiscountUtil.applyDiscount(phone, 5);

        for (Product<?> item : catalog) {
            System.out.println(item.getProductName() + " - " + item.getProductPrice() + " (" + item.getProductCategory().getCategoryName() + ")");
        }
    }
}
