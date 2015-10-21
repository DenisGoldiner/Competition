package com.denis.competition;

/**
 *
 * Created by Denis on 20.10.2015.
 */
public class MyDate {

//    enum month{Jnuary, February, March, April, May, June, July, August, September, October, November, Decenber}

    private int year;
    private int month;
    private int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    @Override
    public String toString() {
        return year + "." + month + "." + day;
    }
}
