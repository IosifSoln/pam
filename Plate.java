package com.company;


public class Plate {
    private int food;


    int getFood() {
        return food;
    }

    Plate(int food) {
        this.food = food;
    }

    //уменьшение колличества еды , если миска не пуста
    void decreaseFood(int appetite) {

        if (food >= appetite) {
            food -= appetite;
        } else {
            System.out.println("миска пуста!");

        }
    }

    //добавление еды , если миска пуста
    void addFood() {
        this.food += 300;
        System.out.println("В миске лежит :" + food + "грамм");
    }

    //проверка колличества еды
    boolean checkFood(int n) {
        return (food - n) >= 0;
    }


}
