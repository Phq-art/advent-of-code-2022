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

    public List<Integer> getElveCarryingHighestAmountOfCalories() throws IOException {
        File calories = getResource("calories.txt");
        List<Integer> result = new ArrayList<>();

        BufferedReader br = new BufferedReader(new FileReader(calories));
        int position = 0;
        int caloryValue = 0;
        int tempCaloryValue = 0;
        String currentElve;

        while(br.ready()) {
            currentElve = br.readLine().trim();
            if(currentElve.isEmpty()) {
                if(tempCaloryValue > caloryValue) {
                    caloryValue = tempCaloryValue;
                };
                tempCaloryValue = 0;
                position++;
            }
            else {
                tempCaloryValue += Integer.parseInt(currentElve);
            }
        }
        result.add(position);
        result.add(caloryValue);
        return result;
    }
}
