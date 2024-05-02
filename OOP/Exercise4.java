package OOP;

public class Exercise4 {
    private String name;
    private String id;
    private String group;
    private String email;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getInfo() {
        return name + " - " + id + " - " + group + " - " + email;
    }

    public Exercise4() {
        this.name = "student";
        this.id = "0000";
        this.email = "uet@vnedu";
        this.group = "k62cb";
    }

    public Exercise4(String name, String id, String email) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.group = "k62cb";
    }

    public Exercise4(Exercise4 nam) {
        this.name = nam.name;
    }

}

class Infomation {
    public Infomation(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

}

class Solution1 {
    public static void main(String[] args) {
        Exercise4 nam = new Exercise4();
        System.err.println(nam.getInfo());
        Infomation thang = new Infomation("thang");
        Exercise4 huyen = new Exercise4(nam);
        System.err.println(huyen.getInfo());
    }
}
