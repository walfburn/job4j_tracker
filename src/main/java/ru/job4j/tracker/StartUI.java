package ru.job4j.tracker;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StartUI {

    public static void main(String[] args) {
        Item someItem = new Item();
        someItem.getCreated();
        System.out.println(someItem.getCreated());
    }
}
