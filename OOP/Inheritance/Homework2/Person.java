package OOP.Inheritance.Homework2;

public class Person {
    private String name;
    private int age;
    private String adress;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Person(String name, int age, String adress) {
        this.name = name;
        this.age = age;
        this.adress = adress;
    }

    public void display() {
        System.err.println("Name: " + name);
        System.err.println("Age: " + age);
        System.err.println("Adress: " + adress);
    }

}
