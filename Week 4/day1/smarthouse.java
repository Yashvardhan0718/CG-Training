package week4.day1.level1;

import java.util.ArrayList;
import java.util.List;

abstract class WarehouseItem {
    private String name;

    public WarehouseItem(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class ElectronicItem extends WarehouseItem {
    public ElectronicItem(String name) {
        super(name);
    }
}

class GroceryItem extends WarehouseItem {
    public GroceryItem(String name) {
        super(name);
    }
}

class FurnitureItem extends WarehouseItem {
    public FurnitureItem(String name) {
        super(name);
    }
}

class Storage<T extends WarehouseItem> {
    private List<T> items;

    public Storage() {
        items = new ArrayList<>();
    }

    public void addItem(T item) {
        items.add(item);
    }

    public List<T> getItems() {
        return items;
    }
}

class WarehouseDisplay {
    public static void showItems(List<? extends WarehouseItem> items) {
        for (WarehouseItem item : items) {
            System.out.println(item.getName());
        }
    }
}

public class smarthouse {
    public static void main(String[] args) {
        Storage<ElectronicItem> electronicStorage = new Storage<>();
        electronicStorage.addItem(new ElectronicItem("Laptop"));
        electronicStorage.addItem(new ElectronicItem("Smartphone"));

        Storage<GroceryItem> groceryStorage = new Storage<>();
        groceryStorage.addItem(new GroceryItem("Rice"));
        groceryStorage.addItem(new GroceryItem("Milk"));

        Storage<FurnitureItem> furnitureStorage = new Storage<>();
        furnitureStorage.addItem(new FurnitureItem("Chair"));
        furnitureStorage.addItem(new FurnitureItem("Table"));

        WarehouseDisplay.showItems(electronicStorage.getItems());
        WarehouseDisplay.showItems(groceryStorage.getItems());
        WarehouseDisplay.showItems(furnitureStorage.getItems());
    }
}
