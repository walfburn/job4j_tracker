package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book bookOne = new Book("Clean code", 1000);
        Book bookTwo = new Book("Aivengo", 123);
        Book bookThree = new Book("Java First", 500);
        Book bookFour = new Book("Some book", 100);
        Book[] books = new Book[4];
        books[0] = bookOne;
        books[1] = bookTwo;
        books[2] = bookThree;
        books[3] = bookFour;
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            System.out.println(book.getName() + ". Page count: " + book.getPageCount());
        }
        System.out.println("\n" + "Переставим местами значения в ячейках 0 и 3");
        books[0] = bookFour;
        books[3] = bookOne;
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            System.out.println(book.getName() + ". Page count: " + book.getPageCount());
        }
        System.out.println("\n" + "Вывод  книг с именем \"Clean code\"");
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            if ("Clean code".equals(book.getName())) {
                System.out.println(book.getName() + ". Page count: " + book.getPageCount());
            }
        }
    }
}
