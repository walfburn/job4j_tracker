package ru.job4j.pojo;

public class ShopDrop {
    public static Product[] delete(Product[] products, int index) {

        for (int indexOf = index; indexOf < products.length - 1; indexOf++) {
            products[indexOf] = products[indexOf + 1];
        }
        products[products.length - 1] = null;
        return products;
    }
}
