package ru.job4j.inheritance;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class UsagePackageDate {
    public static void main(String[] args) {
        LocalDateTime currentDate = LocalDateTime.now();
        System.out.println(currentDate);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String currentDateTimeFormat = currentDate.format(formatter);
        System.out.println(currentDateTimeFormat);
    }
}
