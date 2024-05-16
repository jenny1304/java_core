public class Testcase {
    public static void main(String[] args) {
        Person person1 = new Person("Thang", "Ha Noi");
        Person person2 = new Person("Huyen", "Ha Noi");
        Car car = new Car("BMW", "S400", "29A - 888.88", person2, 4);
        Motorbike motorbike = new Motorbike("Vinfast", "VF3", "99E1-999.99", person1, false);

        // car.transferOwnership(person1);
        person1.addVehicle(car);
        System.out.println(person1.getVehiclesInfo());
    }
}
