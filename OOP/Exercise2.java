package OOP;

public class Exercise2 {
    private String name;
    private int age;
    private String gender;
    private double gpa;
    private String password = "122222";

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public Exercise2(String name, int age, String gender, double gpa) {
        // C1
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.gpa = gpa;

        // C2
        // name = _name;
        // age = _age;
        // gender = _gender;
        // gpa = _gpa;
    }

    public void display() {
        System.err.println(name);
        System.err.println(age);
        System.err.println(gender);
        System.err.println(gpa);
        System.err.println(password);
    }
}

class Solution {
    public static void main(String[] args) {
        Exercise2 student = new Exercise2("Quang", 24, "male", 7.7);
        student.setPassword("66666");
        System.err.println(student.getPassword());
    }
}
