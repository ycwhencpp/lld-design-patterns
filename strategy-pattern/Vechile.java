package strategy.pattern;

public class Vechile {

    DriverStrategy driveObj;

    public Vechile(DriverStrategy driveObj) {
        this.driveObj = driveObj;
    }

    public void drive() {
        driveObj.drive();
    }
}