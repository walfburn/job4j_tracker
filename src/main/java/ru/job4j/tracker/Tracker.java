package ru.job4j.tracker;

import java.util.Arrays;
import ru.job4j.tracker.Item;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item[] findAll() {
        return Arrays.copyOf(items, size);
    }

    public Item[] findByName(String key) {
        Item[] names = new Item[size];
        int i = 0;
        for (int index = 0; index < size; index++) {
            if (key.equals(items[index].getName())) {
                names[i] = items[index];
                i++;
            }
        }
        return Arrays.copyOf(names, i);
    }

    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }

}