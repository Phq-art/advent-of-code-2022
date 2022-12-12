package main;

import java.io.File;

/**
* Maybe for some shared fields or ulility methods
*/
public abstract class Day {
    protected final int year;
    protected final int day;

    public static File getResource(String path) {
        return new File("src/main/resources/" + path);
    }

    public Day(int year, int day) {
        this.year = year;
        this.day = day;
    }
}
