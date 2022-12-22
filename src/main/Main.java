package main;

import main.java.year2022.days.Day2;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        // Day 1
/*        try {
            Day1 day1 = new Day1();
            int result = day1.getElveCarryingHighestAmountOfCalories();
            System.out.println("Total amount of calories being carried by top three calory carrier elves " + result);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/

        // Day 2
        try {
            Day2 day2 = new Day2();
            int result = day2.getRockPaperScissorsMatchScore();
            System.out.println("Match score: " + result);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
