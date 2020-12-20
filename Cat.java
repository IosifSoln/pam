package com.company;

public class Cat {
    private final String name;
    private final int appetite;
    private final int satietyTime;
    private int satiety;

    String getName() {
        return name;
    }

    int getAppetite() {
        return appetite;
    }


    int getSatiety() {
        return satiety;
    }

    void setSatiety(int satiety) {
        this.satiety = satiety;
    }

    // основная информация о коте
    Cat(String name, int appetite, int satietyTime) {

        this.name = name;
        this.appetite = appetite;
        this.satietyTime = satietyTime;
        this.satiety = 0;
    }

    // кот ест
    void eat(Plate p) {
        p.decreaseFood(appetite);
        satiety += satietyTime;
    }


}


