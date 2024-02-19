package models;

public interface ToFind {
    Item findByName(Item[] itemsList, String name);

    String getName();
}
