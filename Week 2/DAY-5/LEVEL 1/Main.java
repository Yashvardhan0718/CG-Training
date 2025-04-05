class Animal {
    String name;
    int age;

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    void makeSound() {
        System.out.println("Some animal sound");
    }
}
class Dog extends Animal {
    Dog(String name, int age) {
        super(name, age);
    }

    void makeSound() {
        System.out.println("bow bow bow");
    }
}

class Cat extends Animal {
    Cat(String name, int age) {
        super(name, age);
    }

    void makeSound() {
        System.out.println("meow meow meow");
    }
}

class Bird extends Animal {
    Bird(String name, int age) {
        super(name, age);
    }

    void makeSound() {
        System.out.println("chirp chirp chirp");
    }
}

public class Main {
    public static void main(String[] args) {
        String n = "cat" ;
        int a = 6;

        Animal animal;

        if (n.equalsIgnoreCase("dog")) {
            animal = new Dog(n, a);
        } else if (n.equalsIgnoreCase("cat")) {
            animal = new Cat(n, a);
        } else {
            animal = new Bird(n, a);
        }
        animal.display();
        animal.makeSound();
    }
}
