package ru.job4j.inheritance;

public class PizzaExtraCheese extends Pizza {
    private String cheeseTopping = " + extra cheese";

    public PizzaExtraCheese(String name) {
        super(name);
    }

    public PizzaExtraCheese() {

    }

    @Override
    public String name() {
        return super.name() + cheeseTopping;
    }
}
