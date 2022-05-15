package ru.job4j.inheritance;

public class PizzaExtraCheesaExtraTomato extends PizzaExtraCheese {
    private String extraTomato = " + extra tomato";

    public PizzaExtraCheesaExtraTomato(String name) {
        super(name);
    }

    public PizzaExtraCheesaExtraTomato() {

    }

    @Override
    public String name() {
        return super.name() + extraTomato;
    }
}
