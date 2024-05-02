package OOP.Inheritance.Introduction;

public class Thang extends Person {

    public Thang() {
        super();
    }

    public Thang(String name) {
        // Dùng để sử dụng thuộc tính/phương thức của cha (parent)
        super(name);
    }

    public static void main(String[] args) {
        // Cách 1: Sử dụng set
        Thang thang = new Thang();

        // Dùng khi muốn set cho thuộc tính của đối tượng
        thang.setName("Thang");
        System.out.println(thang.getName());

        // Cách 2: Sử dụng contructor
        Thang thang1 = new Thang("Thang1");
        System.out.println(thang1.getName());

    }
}
