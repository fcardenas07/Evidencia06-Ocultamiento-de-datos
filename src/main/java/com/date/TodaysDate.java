package com.date;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class TodaysDate {
    public int day;
    protected int year;
    String time;
    private int month;

    public void printDateAndTime() {
        GregorianCalendar calendar = new GregorianCalendar();

        time = calendar.get(Calendar.HOUR_OF_DAY) + ":"
                + calendar.get(Calendar.MINUTE) + ":"
                + calendar.get(Calendar.SECOND);

        day = calendar.get(Calendar.DATE);
        month = calendar.get(Calendar.MONTH) + 1;
        year = calendar.get(Calendar.YEAR);

        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Tiempo: %s%nFecha: %s/%s/%s%n".formatted(time, day, month, year);
    }
}
