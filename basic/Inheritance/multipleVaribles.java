package Inheritance;

class Employee {
    private int id;
    private double salary;

    public void setData(int id, double salary) {
        this.id = id;
        this.salary = salary;
    }

    public void showData() {
        System.out.println("ID: " + id + " Salary: " + salary);
    }
}

public class multipleVaribles {
    public static void main(String[] args) {

        Employee emp = new Employee();

        emp.setData(101, 50000);
        emp.showData();
    }
}