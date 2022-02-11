package ru.job4j.oop;

public class DummyDic {

    public String engToRus(String eng) {
        eng = "permission";
        return "Неизвестное слово. " + eng;
    }

    public static void main(String[] args) {
        DummyDic dictionary = new DummyDic();
        String word = dictionary.engToRus("");
        System.out.println(word);
    }
}
