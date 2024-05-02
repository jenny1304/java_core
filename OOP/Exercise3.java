package OOP;

public class Exercise3 {
    private int id;
    private String address;
    private int score;
    private String name;
    private int age;

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Exercise3(int id, String name, int age, String address, int score) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.score = score;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        if (score < 0) {
            this.score = 0;
        } else if (score > 10) {
            this.score = 10;
        } else {
            this.score = score;
        }
    }

}

class Entry {
    public static void main(String[] args) {
        Exercise3 s = new Exercise3(1001, "Trung", 24, "Ha Noi", 5);
        System.out.println(s.getId()); // 1001
        System.out.println(s.getName()); // Trung
        System.out.println(s.getAge()); // 24
        System.out.println(s.getAddress()); // Ha Noi
        System.out.println(s.getScore()); // 5
        s.setScore(-7);
        System.out.println(s.getScore()); // 0
        s.setScore(15);
        System.out.println(s.getScore()); // 10
    }
}
