


import java.util.*;


public class Main {
    public static void main(String[] args) {
//     создаем   массив животных
        final String[] animals = {"dog", "cat", "hamster"
                , "pig", "monkey", "wolf", "eagle",
                "sneak", "salmon", "salmon", "salmon", "salmon", "lian", "tiger"
                , "mouse", "fish", "cat"};
        System.out.println("\nзадание1\n");
        task1(animals);
        task2();
    }

    //метод который пишет животных и их колличество
    private static void task1(final String[] arr) {
        final Map<String, Integer> nameAndCount = new HashMap<>();
        for (final String name : arr) {
            Integer count = nameAndCount.get(name);
//            информация о колличестве
            if (count == null) {
                nameAndCount.put(name, 1);
            } else {
                nameAndCount.put(name, ++count);
            }
        }
        System.out.println(nameAndCount);
    }

    private static void task2() {
//        создаем новую телефонную книгу
        phoneBook phoneBook1 = new phoneBook();
//заполняем ее
        phoneBook1.add("Квашонкин", "89991324321 ");
        phoneBook1.add("Долгополов", "89115324316 ");
        phoneBook1.add("Мирзализаде", "8917123234 ");
        phoneBook1.add("Мирзализаде", "89171232341234 ");
        phoneBook1.add("Оганесян", "891432141412 ");
//выводим номер телефона
        System.out.println("\nзадание2\n");
        System.out.println(phoneBook1.get("Квашонкин"));
        System.out.println(phoneBook1.get("Долгополов"));
        System.out.println(phoneBook1.get("Мирзализаде"));
        System.out.println(phoneBook1.get("Оганесян"));
    }

}

