package main.java.year2022.days;

import main.Day;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Day1 extends Day {

    public Day1() {
        super(2022, 1);
    }

    public int getElveCarryingHighestAmountOfCalories() throws IOException {
        File calories = getResource("calories.txt");
        List<Integer> allCaloryCarries = new ArrayList<>();
        // initialize in order to get the first three values
        allCaloryCarries.add(0);
        allCaloryCarries.add(0);
        allCaloryCarries.add(0);

        BufferedReader br = new BufferedReader(new FileReader(calories));
        int caloryValue = 0;
        int tempCaloryValue = 0;
        String currentElve;

        while(br.ready()) {
            currentElve = br.readLine().trim();
            if(currentElve.isEmpty()) {
                if(tempCaloryValue > caloryValue) {
                    if(allCaloryCarries.get(0) < tempCaloryValue) {
                        allCaloryCarries.add(0, tempCaloryValue);
                        tempCaloryValue = 0;
                    }
                    else if(allCaloryCarries.get(1) < tempCaloryValue) {
                        allCaloryCarries.add(1, tempCaloryValue);
                        tempCaloryValue = 0;
                    }
                    else if(allCaloryCarries.get(2) < tempCaloryValue) {
                        allCaloryCarries.add(2, tempCaloryValue);
                        tempCaloryValue = 0;
                    }
                    else {
                        tempCaloryValue = 0;
                    }
                }
            }
            else {
                tempCaloryValue += Integer.parseInt(currentElve);
            }
        }
        return allCaloryCarries.get(0) + allCaloryCarries.get(1) + allCaloryCarries.get(2);
    }
}
