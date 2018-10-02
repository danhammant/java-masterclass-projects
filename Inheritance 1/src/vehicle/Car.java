package vehicle;

public class Car extends Vehicle {
    private int seats;
    private int wheels;
    private int gears;
    private int gear;
    private boolean isManual;

    public Car(String name, int topSpeed, boolean isManual, int seats, int wheels, int gears) {
        super(name, topSpeed);
        this.seats = seats;
        this.wheels = wheels;
        this.gears = gears;
        this.isManual = isManual;
        this.gear = 0;
    }

    public void upGear() {
        if (this.gear++ <= this.gears) {
            this.gear++;
        }
    }

    public void downGear() {
        if (this.gear -- >= -1) {
            this.gear--;
        }
    }
}
