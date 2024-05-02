package OOP.Inheritance.Homework2;

public class Teacher extends Person {
    private int salary;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Teacher(String name, int age, String adress, int salary) {
        super(name, age, adress);
        this.salary = salary;
    }

    public void display() {
        super.display();
        System.err.println("Salary: " + salary);
    }

}
