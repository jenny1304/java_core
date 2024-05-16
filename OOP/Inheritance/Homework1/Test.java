package OOP.Inheritance.Homework1;

public class Test {
    public static void main(String[] args) {
        Person person = new Person("Tester", "144 Xuan Thuy");
        System.out.println(person.toString());

        Student student = new Student("Tester", "144 Xuan Thuy", "QH2016", 2018, 280);
        System.out.println(student.toString());

        Staff staff = new Staff("Tester", "144 Xuan Thuy", "UET", 3240);
        System.out.println(staff.toString());
    }
}