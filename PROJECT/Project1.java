package PROJECT;

public class Project1 {
    public static void ComputerGrade(int average) {
        if (average >= 80) {
            System.err.println("Grade A");
        } else if (average >= 60 && average < 80) {
            System.err.println("Grade B");
        } else if (average >= 50 && average < 60) {
            System.err.println("Grade C");
        } else {
            System.err.println("Grade F");
        }
    }

    public static void main(String[] args) {
        int scores[] = { 55, 64, 75, 80, 65 };
        int average = (55 + 64 + 75 + 80 + 65) / 5;
        System.err.println("Average = " + average);
        ComputerGrade(average);
    }
}
