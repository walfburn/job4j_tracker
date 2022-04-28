package ru.job4j.inheritance;

public class Dentist extends Doctor {

    private final String tooth;

    public Dentist(String name, String surname, String education, String birthday, String diagnos, String tooth) {
        super(name, surname, education, birthday, diagnos);
        this.tooth = tooth;
    }

    public String deleteTooth(boolean delete) {
        return tooth;
    }
}
