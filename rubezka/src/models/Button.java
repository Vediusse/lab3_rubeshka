package models;

public class Button implements Pressable {


    @Override
    public String press() {
        return "нажал на кнопку";
    }
}

