package OOP.Inheritance.Homework2;

public class Student extends Person {
    private double gpa;

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public Student(String name, int age, String adress, double gpa) {
        super(name, age, adress);
        this.gpa = gpa;
    }

    public void display() {
        super.display();
        System.err.println("GPA: " + gpa);
    }
}
