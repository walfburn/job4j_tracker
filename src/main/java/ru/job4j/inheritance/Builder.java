package ru.job4j.inheritance;

public class Builder extends Engineer {

    private String build;

    public Builder(String name, String surname, String education, String birthday, String build) {
        super(name, surname, education, birthday);
        this.build = build;
    }

    public String canBuild(int make) {
        if (make == 0) {
            build = "Can't build";
        } else if (make == 1) {
            build = "Can build";
        }
        return build;
    }

}
