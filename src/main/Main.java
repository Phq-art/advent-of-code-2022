package main;

import main.java.year2022.days.Day1;

import java.io.*;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Day 1
        try {
            Day1 day1 = new Day1();
            List<Integer> result = day1.getElveCarryingHighestAmountOfCalories();
            System.out.println("Index of Elve " + result.get(0));
            System.out.println("Total amount of calories being carried " + result.get(1));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
