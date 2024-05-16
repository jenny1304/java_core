public class Motorbike extends Vehicle {
    private boolean hasSideCar;

    public Motorbike(String brand, String model, String registrationNumber, Person owner, boolean hasSideCar) {
        super(brand, model, registrationNumber, owner);
        this.hasSideCar = hasSideCar;
    }

    public boolean isHasSideCar() {
        return hasSideCar;
    }

    public void setHasSideCar(boolean hasSideCar) {
        this.hasSideCar = hasSideCar;
    }

    public String getInfo() {
        return String.format(
                "Car:\n\tBrand: %s\n\tModel: %s\n\tRegistration Number: %s\n\tHas Side Car: %s\n\tBelongs to %s",
                this.getBrand(), this.getModel(), this.getRegistrationNumber(), this.isHasSideCar(),
                this.getOwner().getName());
    }
}
