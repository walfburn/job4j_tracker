package ru.job4j.inheritance;

public class Doctor extends Profession {

    private final String diagnos;

    public Doctor(String name, String surname, String education, String birthday, String diagnos) {
        super(name, surname, education, birthday);
        this.diagnos = diagnos;
    }

    public String heal(String pacient) {
        return diagnos;
    }

}
