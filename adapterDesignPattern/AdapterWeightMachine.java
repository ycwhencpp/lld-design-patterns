package adapterDesignPattern;

public class AdapterWeightMachine implements AdapterWeightMachineInterface {

    WeightMachineInterface weightMachine;

    public AdapterWeightMachine(WeightMachineInterface weightMachine) {
        this.weightMachine = weightMachine;
    }

    @Override
    public double getWeightInKg() {

        double weightInPounds = this.weightMachine.getWeightInPounds();

        return weightInPounds * 0.5;
    }

}
