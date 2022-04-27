package ru.job4j.inheritance;

public class Dentist extends Doctor {

    private String tooth;

    public Dentist(String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
    }

    public Dentist(String tooth) {
        super();
        this.tooth = tooth;
    }

    public String deleteTooth(boolean delete) {
        return tooth;
    }
}
