package stateDesignPattern.states;

import java.util.List;

import stateDesignPattern.Coin;
import stateDesignPattern.Item;
import stateDesignPattern.VendingMachine;

public class DispenseState implements state {

    public DispenseState(VendingMachine machine, String codeNumber) {
        try {
            dispenseProduct(machine, codeNumber);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    @Override
    public Item dispenseProduct(VendingMachine machine, String codeNumber) throws Exception {
        machine.setState(new IdleState(machine));
        for (Item item : machine.getitems()) {
            if (item.itemCode.equals(codeNumber)) {
                return item;
            }
        }
        throw new Exception("Something wrong happended!");
    }

    @Override
    public void chooseProduct(VendingMachine machine, String codeNumber) throws Exception {
        throw new Exception("Cant choose product in Dispense State");

    }

    @Override
    public int getChange(int returnChangeAmount) throws Exception {
        throw new Exception("Cant return change in Dispense State");

    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
        throw new Exception("Cant insert coin  in Dispense State");

    }

    @Override
    public void pressInsertCashButton(VendingMachine machine) throws Exception {
        throw new Exception("Cant press button in Dispense State");

    }

    @Override
    public void pressStartSelectionButton(VendingMachine machine) throws Exception {
        throw new Exception("Cant select product in Dispense State");

    }

    @Override
    public List<Coin> refundAmount(VendingMachine machine) throws Exception {
        throw new Exception("Cant refund in Dispense State");

    }

}
