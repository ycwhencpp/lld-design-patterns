package stateDesignPattern.states;

import java.util.ArrayList;
import java.util.List;

import stateDesignPattern.Coin;
import stateDesignPattern.Item;
import stateDesignPattern.VendingMachine;

public class SelectionState implements state {

    @Override
    public void chooseProduct(VendingMachine machine, String codeNumber) throws Exception {
        Item item = null;
        for (Item it : machine.getitems()) {
            if (it.itemCode.equals(codeNumber)) {
                item = it;
            }
        }

        if (item == null) {
            throw new Exception("Please Enter valid code");
        }
        int amountPaidByUser = 0;
        for (Coin coin : machine.getMoneyStore()) {
            amountPaidByUser += coin.value;
        }
        if (amountPaidByUser < item.price) {
            throw new Exception("Insufficent funds");
        } else {
            if (amountPaidByUser > item.price) {
                getChange(amountPaidByUser - item.price);
            }
            machine.setState(new DispenseState(machine, codeNumber));
        }

    }

    @Override
    public int getChange(int returnChangeAmount) throws Exception {
        System.out.println("Collect remaining amout from tray : " + returnChangeAmount);
        return returnChangeAmount;
    }

    @Override
    public List<Coin> refundAmount(VendingMachine machine) throws Exception {
        machine.setState(new IdleState(machine));
        return machine.getMoneyStore();
    }

    @Override
    public Item dispenseProduct(VendingMachine machine, String codeNumber) throws Exception {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
        // TODO Auto-generated method stub

    }

    @Override
    public void pressInsertCashButton(VendingMachine machine) throws Exception {
        // TODO Auto-generated method stub

    }

    @Override
    public void pressStartSelectionButton(VendingMachine machine) throws Exception {
        // TODO Auto-generated method stub

    }

}
