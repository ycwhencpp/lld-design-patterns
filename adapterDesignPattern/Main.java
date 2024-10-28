package adapterDesignPattern;

public class Main {
    public static void main(String[] args) {
        WeightMachineInterface weightMachine = new DigitalWeightMachine();

        AdapterWeightMachineInterface adpaterWeightMachine = new AdapterWeightMachine(weightMachine);

        double weightInKg = adpaterWeightMachine.getWeightInKg();

        System.out.println("Your Weight is : " + weightInKg);
    }
}
