/*
    Zadanie 6: Stworzenie 8 pracowników.
    Autor: Rafał Tęcza
    Index: s19468
*/
package pjwstk.lab3.zadanie6;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Employee employee1 = new Employee(0, "Tomek", "Stankiewicz", 3500, new Date(20, 3, 2015));
        Employee employee2 = new Employee(1, "Filip", "Kora", 2700, new Date(12, 7, 2016));
        Employee employee3 = new Employee(2, "Anita", "Gajer", 900, new Date(25, 12, 2017));
        Employee employee4 = new Employee(3, "Daniel", "Myszkowski", 6400, new Date(5, 7, 2018));
        Employee employee5 = new Employee(4, "Karol", "Markowicz", 3500, new Date(17, 11, 2014));
        Employee employee6 = new Employee(5, "Iwona", "Kalowska", 1700, new Date(23, 1, 2019));
        Employee employee7 = new Employee(6, "Bogdan", "Murawski", 5500, new Date(29, 4, 2013));
        Employee employee8 = new Employee(7, "Renata", "Kortyka", 2350, new Date(16, 6, 2017));

        ArrayList<Employee> list = new ArrayList();

        list.add(employee1);
        list.add(employee2);
        list.add(employee3);
        list.add(employee4);
        list.add(employee5);
        list.add(employee6);
        list.add(employee7);
        list.add(employee8);
    }
}
