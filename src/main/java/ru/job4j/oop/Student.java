package ru.job4j.oop;

public class Student {

    public void music() {
        System.out.println("Tra ta ta");
    }

    public void songOne() {
        System.out.println("I believe I can fly");
    }

    public void songTwo() {
        System.out.println("I believe I can touch the sky");
    }

    public void songThree() {
        System.out.println("I think about it every night and day");
    }

    public void songFour() {
        System.out.println("Spread my wings and fly away");
    }

    public static void main(String[] args) {
        Student petya = new Student();
        petya.music();
        petya.music();
        petya.music();
        petya.songOne();
        petya.songTwo();
        petya.songThree();
        petya.songFour();
    }
}
