package ru.job4j.inheritance;

public class PizzaExtraCheese extends Pizza {
    private String cheeseTopping = " + extra cheese";

    @Override
    public String name() {
        return super.name() + cheeseTopping;
    }
}
