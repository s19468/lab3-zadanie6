/*
    Zadanie 6: Stworzenie klasy Date używając wzorcu.
    Autor: Rafał Tęcza
    Index: s19468
*/
package pjwstk.lab3.zadanie6;

public class Date {

    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        String date = "";

        if(getDay() < 10) {
            date = date + "0" + getDay() + "/";
        } else {
            date = date + getDay() + "/";
        }

        if(getMonth() < 10) {
            date = date + "0" + getMonth() + "/";
        } else {
            date = date + getMonth() + "/";
        }

        date = date + getYear();

        return date;
    }
}
