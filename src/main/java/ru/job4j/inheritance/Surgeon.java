package ru.job4j.inheritance;

public class Surgeon extends Doctor {

    private final int operations;

    public Surgeon(String name, String surname, String education, String birthday, int operations) {
        super(name, surname, education, birthday);
        this.operations = operations;
    }

    public int getOperation() {
        return operations;
    }
}
