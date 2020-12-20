package com.company;

import java.util.Random;

public class Main {
    private static int Time = 0;

    public static void main(String[] args) {
        Random random = new Random();
        Cat[] cat = new Cat[3];
        cat[0] = new Cat("Мартин", random.nextInt(100) + 100, random.nextInt(6) + 1);
        cat[1] = new Cat("Феликс", random.nextInt(100) + 150, random.nextInt(7) + 1);
        cat[2] = new Cat("Моня", random.nextInt(100) + 175, random.nextInt(8) + 1);
        Plate plate = new Plate(random.nextInt(400) + 300);

        do {
            for (Cat i : cat) {

                // кот голоден
                if (i.getSatiety() == 0) {

                    //добавление корма , если его не хватает
                    if (!plate.checkFood(i.getAppetite())) {
                        plate.addFood();
                    }

                    //кот ест
                    i.eat(plate);
                    System.out.println("Кот " + i.getName() + " съел " + i.getAppetite() + " грамм  , проголодается через " + (i.getSatiety()) + " часа/ов ." + " В миске осталось" + plate.getFood() + "грамм");
                }


                i.setSatiety(i.getSatiety() - 1);
            }
            System.out.println("\nС  начала кормежки прошел/ло " + Time + " час/а . В миске осталось " + plate.getFood() + " грамм\n");
            Time++;

        } while (Time <= 24);
    }
}



