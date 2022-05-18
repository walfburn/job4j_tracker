package ru.job4j.inheritance;

public class PizzaExtraCheesaExtraTomato extends PizzaExtraCheese {
    private String extraTomato = " + extra tomato";

    @Override
    public String name() {
        return super.name() + extraTomato;
    }
}
