package ru.job4j.pojo;

import java.util.Date;

public class Police {
    public static void main(String[] args) {
        License license = new License();
        license.setOwner("VSirotkin");
        license.setModel("Passat B6");
        license.setCode("363");
        license.setCreated(new Date());

        System.out.println(license.getOwner() + license.getModel() + license.getCode() + license.getCreated());
    }
}
