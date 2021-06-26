package main;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli",
                "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom",
                "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

        String word = words[(int) Math.floor(Math.random() * words.length)];


        System.out.println(Arrays.toString(words));
        String Answer;
        StringBuilder lettersInPlace;
//        System.out.println(word);
        do {
            System.out.println("угадайте слово :");
            Answer = myScanner.nextLine();
            if (Objects.equals(Answer, word)) {
                System.out.println("правильно!");

            } else {
                lettersInPlace = new StringBuilder("###############");
                int shortestWordLenght;
                if (word.length() < Answer.length()) {
                    shortestWordLenght = word.length();
                } else {
                    shortestWordLenght = Answer.length();
                }
                for (int i = 0; i < shortestWordLenght; i++) {
                    if (Answer.charAt(i) == word.charAt(i)) {
                        lettersInPlace.setCharAt(i, Answer.charAt(i));
                    }
                }
                System.out.println("неправильно, пробуйте еще:");
                System.out.println(lettersInPlace);

            }
        } while (!Objects.equals(Answer, word));
    }
}