package ru.job4j.oop;

public class DummyDic {

    public String engToRus(String eng) {
        eng = "permission";
        return eng;
    }

    public static void main(String[] args) {
        DummyDic dictionary = new DummyDic();
        String word = dictionary.engToRus("");
        System.out.println("Неизвестное слово. " + word);
    }
}
