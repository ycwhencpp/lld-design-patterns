package stateDesignPattern;

import java.util.ArrayList;
import java.util.List;

import stateDesignPattern.states.state;

public class Main {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine();
        try {

            List<Item> itemList = new ArrayList<>();
            itemList.add(new Item(10, "Coke", "101"));
            itemList.add(new Item(17, "Soda", "102"));
            itemList.add(new Item(6, "Water", "103"));

            machine.setItems(itemList);

            System.out.println("Vending Machine created ");

            System.out.println();

            state MachineState = machine.getState();

            MachineState.pressInsertCashButton(machine);

            System.out.println("Insert Coin pressed");

            MachineState = machine.getState();

            MachineState.insertCoin(machine, Coin.NICKEL);
            MachineState.insertCoin(machine, Coin.QUARTER);

            System.out.println("COIN inserted");

            MachineState.pressStartSelectionButton(machine);

            System.out.println("Selction Button Pressed");

            MachineState = machine.getState();

            MachineState.chooseProduct(machine, "101");

            System.out.println("Priduct dispensed");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
