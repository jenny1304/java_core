package OOP.Project2;

public class Student {
    private String name;
    private String id;
    private String group;
    private String email;

    public Student() {
        name = "Student";
        id = "000";
        group = "K62CB";
        email = "uet@gmail.com";
    }

    public Student(String name, String id, String email) {
        this.name = name;
        this.id = id;
        this.email = email;
        group = "K62CB";
    }

    public Student(String name, String id, String email, String group) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.group = group;
    }

    public Student(Student s) {
        this.name = s.getName();
        this.id = s.getId();
        this.group = s.getGroup();
        this.email = s.getEmail();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public static void main(String[] args) {
        // Test case 1
        // Student student1 = new Student();
        // System.err.println(student1.name);
        // System.err.println(student1.id);
        // System.err.println(student1.group);
        // System.err.println(student1.email);

        // Test case 2
        Student student2 = new Student("Thang", "21020", null);
        System.err.println(student2.name);
        System.err.println(student2.id);
        System.err.println(student2.group);
        System.err.println(student2.email);

        // Test case 3
        Student student3 = new Student(student2); // student2 la 1 doi tuong
        System.err.println(student3.name);
        System.err.println(student3.id);
        System.err.println(student3.group);
        System.err.println(student3.email);
    }

}
