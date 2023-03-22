package com.iteso.calendar;

import java.time.LocalTime;

public class DateTime extends Date {

    private int seconds, minutes, hours = 0;

    public DateTime(int day, int month, int year, int format, int hours, int minutes, int seconds) {
        super(day, month, year, format);
        setTime(hours, minutes, seconds);
    }

    public DateTime(int day, int month, int year, int hours, int minutes, int seconds) {
        super(day, month, year);
        setTime(hours, minutes, seconds);
    }

    public DateTime(int hours, int minutes, int seconds) {
        super();
        setTime(hours, minutes, seconds);
    }

    public DateTime() {
        super();
        toSystemTime();
    }

    public DateTime(Date d) {
        super(d.getDay(), d.getMonth(), d.getYear());
        toSystemTime();
    }

    public void toSystemTime() {
        LocalTime now = LocalTime.now();
        this.hours = now.getHour();
        this.minutes = now.getMinute();
        this.seconds = now.getSecond();
    }

    public void setTime(int hours, int minutes, int seconds) {
        setHours(hours);
        setMinutes(minutes);
        setSeconds(seconds);
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        if (seconds >= 0 && seconds < 60)
            this.seconds = seconds;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        if (minutes >= 0 && minutes < 60)
            this.minutes = minutes;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        if (hours >= 0 && hours < 24)
            this.hours = hours;
    }

    public String toString() {
        if (this.getFormat() == 0)
            return String.format("[%02d:%02d:%02d] %s", this.hours, this.minutes, this.seconds, super.toString());
        else {
            int temphours = this.hours;
            String AMPM = "AM";
            if (this.hours >= 12) AMPM = "PM";
            if (this.hours == 0) temphours = 12;
            else if (this.hours > 12) temphours -= 12;
            return String.format("[%02d:%02d:%02d %s] %s", temphours, this.minutes, this.seconds, AMPM, super.toString());
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof DateTime)) return false;
        DateTime objDT = (DateTime) obj;
        return super.equals(obj) && this.hours == objDT.getHours() && this.minutes == objDT.getMinutes() && this.seconds == objDT.getSeconds();
    }

    public DateTime clone() {
        DateTime clon = new DateTime(getDay(), getMonth(), getYear(), getFormat(), this.hours, this.minutes, this.seconds);
        return clon;
    }

    public void next() {
        seconds += 1;
        if (seconds == 60) {
            seconds = 0;
            minutes += 1;
            if (minutes == 60) {
                minutes = 0;
                hours++;
                if (hours == 24) {
                    hours = 0;
                    super.next();
                }
            }
        }
    }

    public Date toDate() {
        return super.clone();
    }

}
