package ru.job4j.inheritance;

public class ReportUsage {
    public static void main(String[] args) {
        JSONReport report = new JSONReport();
        String text = report.generate("123", "234");
        System.out.println(text);
    }
}
