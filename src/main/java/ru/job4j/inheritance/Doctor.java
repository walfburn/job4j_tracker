package ru.job4j.inheritance;

public class Doctor extends Profession {

    private String diagnos;

    public Doctor(String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
    }

    public Doctor(String diagnos) {
        this.diagnos = diagnos;
    }

    public Doctor() {

    }

    public String heal(String pacient) {
        return diagnos;
    }

}
