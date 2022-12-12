package main;

import main.java.year2022.days.Day1;

import java.io.*;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Day 1
        try {
            Day1 day1 = new Day1();
            int result = day1.getElveCarryingHighestAmountOfCalories();
            System.out.println("Total amount of calories being carried by top three calory carrier elves " + result);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
