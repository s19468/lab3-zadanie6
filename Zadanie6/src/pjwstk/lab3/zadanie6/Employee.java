/*
    Zadanie 6: Stworzenie klasy Employee używając wzorcu.
    Autor: Rafał Tęcza
    Index: s19468
*/
package pjwstk.lab3.zadanie6;

public class Employee {

    private int id;
    private String firstName;
    private String lastName;
    private int salary;
    private Date date;

    public Employee(int id, String firstName, String lastName, int salary, Date date) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.date = date;
    }

    public int getID() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return getFirstName() + " " + getLastName();
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAnnualSalary() {
        return salary * 12;
    }

    public int raiseSalary(int percent) {
        Double value = (double) getSalary() + (getSalary() * percent/100);
        setSalary(value.intValue());
        return getSalary();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Employee[id=" + getID() +
                ",name=" + getName() +
                ",salary=" + getSalary() + "]";
    }
}
