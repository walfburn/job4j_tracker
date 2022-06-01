package ru.job4j.pojo;

public class Store {
    public static void main(String[] args) {
        Product milk = new Product("Milk", 10);
        Product bread = new Product("Bread", 4);
        Product egg = new Product("Egg", 19);
        Product[] products = new Product[3];
        products[0] = milk;
        products[1] = bread;
        products[2] = egg;
        for (int index = 0; index < products.length; index++) {
            Product prod = products[index];
            System.out.println(prod.getName() + " - " + prod.getCount());
        }

        Product oil = new Product("Oil", 11);
        products[0] = oil;
        for (int index = 0; index < products.length; index++) {
            Product prod = products[index];
            System.out.println(prod.getName() + " - " + prod.getCount());
        }

        for (int index = 0; index < products.length; index++) {
            Product prod = products[index];
            if (prod.getCount() > 10) {
                System.out.println(prod.getName() + " - " + prod.getCount());
            }
        }
    }
}
