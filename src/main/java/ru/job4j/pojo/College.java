package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFio("Жмышенко Валерий Альбертович");
        student.setGroup("34502 Gadza");
        student.setReceipt(new Date());

        System.out.println("Student name: " + student.getFio() + " Student group: "
                + student.getGroup() + " Receipt date: " + student.getReceipt());
    }
}
