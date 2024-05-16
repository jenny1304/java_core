import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private String address;
    private List<Vehicle> vehicleList = new ArrayList<>();

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void addVehicle(Vehicle vehicle) {
        vehicleList.add(vehicle);
    }

    public void removeVehicle(String registrationNumber) {
        for (int i = 0; i < vehicleList.size(); i++) {
            if (registrationNumber.equals(vehicleList.get(i).getRegistrationNumber())) {
                vehicleList.remove(i);
            }
        }
    }

    public String getVehiclesInfo() {
        if (this.getVehicleList() == null) {
            return this.getName() + " has no vehicle!";
        } else {
            String result = this.getName() + " has:\n";
            for (int i = 0; i < vehicleList.size(); i++) {
                result = result + vehicleList.get(i).getInfo() + "\n";
            }
            return result;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Vehicle> getVehicleList() {
        return vehicleList;
    }

    public void setVehicleList(List<Vehicle> vehicleList) {
        this.vehicleList = vehicleList;
    }

}
