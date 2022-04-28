package ru.job4j.inheritance;

public class Engineer extends Profession {

    private final String speciality;

    public Engineer(String name, String surname, String education, String birthday, String speciality) {
        super(name, surname, education, birthday);
        this.speciality = speciality;
    }

    public String choiseSpeciality(String choise) {
        return speciality;
    }
}
