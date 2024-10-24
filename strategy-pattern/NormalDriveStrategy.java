
package strategy.pattern;

class NormalDriveStrategy implements DriverStrategy {

    @Override
    public void drive() {
        System.out.println("normal drive strategy");
    }
}