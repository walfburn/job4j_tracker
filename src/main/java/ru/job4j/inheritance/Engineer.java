package ru.job4j.inheritance;

public class Engineer extends Profession {

    private String speciality;

    public Engineer(String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
    }

    public Engineer(String speciality) {
        this.speciality = speciality;
    }

    public String choiseSpeciality(String choise) {
        return speciality;
    }
}
