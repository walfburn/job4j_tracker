package ru.job4j.inheritance;

public class PizzaShop {
    public static void main(String[] args) {
        Pizza pizza = new Pizza();
        System.out.println(pizza.name());
        PizzaExtraCheese pizzaExtraCheese = new PizzaExtraCheese();
        System.out.println(pizzaExtraCheese.name());
        PizzaExtraCheesaExtraTomato pizzaExtraCheesaExtraTomato = new PizzaExtraCheesaExtraTomato();
        System.out.println(pizzaExtraCheesaExtraTomato.name());
    }
}
