package ru.job4j.oop;

public class Error {

    private boolean active;

    private int status;

    private String message;

    public Error() {

    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printError() {
        System.out.println("Активность: " + active);
        System.out.println("Статус: " + status);
        System.out.println("Сообщение: " + message + "\n");
    }

    public static void main(String[] args) {
        Error errorOne = new Error();
        Error errorTwo = new Error(false, 401, "Unauthorized");
        Error errorThree = new Error(true, 500, "Internal Server Error");
        errorOne.printError();
        errorTwo.printError();
        errorThree.printError();
    }

}
