package OOP.Project2;

import java.util.ArrayList;

public class StudentManagement {
    public static ArrayList<Student> students = new ArrayList<>();

    public static boolean sameGroup(Student student1, Student student2) {
        if (student1.getGroup() == student2.getGroup()) {
            return true;
        }
        return false;
    }

    public static void addStudent(Student newStudent) {
        students.add(newStudent);
    }

    public static String studentsByGroup() {
        String result = "";
        String group[] = new String[students.size()];

        for (int i = 0; i < students.size(); i++) {
            group[i] = students.get(i).getGroup();
        }

        for (int i = 0; i < students.size(); i++) {
            if (group[i] != null) {
                String checkGroup = group[i];
                result = result + checkGroup + "\n";

                for (int j = i; j < students.size(); j++) {
                    if (students.get(j).getGroup() == checkGroup) {
                        result = result + students.get(j).getName()
                                + " - " + students.get(j).getId()
                                + " - " + students.get(j).getGroup()
                                + " - " + students.get(j).getEmail() + "\n";
                        group[j] = null;
                    }
                }
            }

        }
        return result;
    }

    public static void main(String[] args) {
        // Test case 1
        Student student1 = new Student("Thang", "2003", "cungvanthang"); // Group: K62CB
        Student student2 = new Student("Huyen", "2006", "phamhuyen"); // Group: K62CB
        Student student3 = new Student("Huy", "2006", "phamhuy", "K66C");
        Student student4 = new Student("Kien", "2006", "phamhuy");
        Student student5 = new Student("Long", "2002", "nguyenlong", "K66C");

        System.err.println(sameGroup(student1, student2));

        // Test case 2
        addStudent(student1);
        addStudent(student2);
        addStudent(student3);
        addStudent(student4);
        addStudent(student5);

        // for (int i = 0; i < students.size(); i++) {
        // // System.out.println(students.get(i).getName());
        // // System.out.println(students.get(i).getGroup());
        // // System.out.println(students.get(i).getEmail());
        // }

        // Test case 3
        System.out.println(studentsByGroup());
    }
}
