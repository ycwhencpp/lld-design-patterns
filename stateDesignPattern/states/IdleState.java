package stateDesignPattern.states;

import java.util.ArrayList;
import java.util.List;

import stateDesignPattern.Coin;
import stateDesignPattern.Item;
import stateDesignPattern.VendingMachine;

public class IdleState implements state {

    public IdleState() {
        System.out.println("Machine in Ideal State");
    }

    public IdleState(VendingMachine machine) {
        System.out.println("Machine in Ideal State");
        machine.setMoneyStore(new ArrayList<>());
    }

    @Override
    public void pressInsertCashButton(VendingMachine machine) throws Exception {
        System.out.println("Button pressed , insert coin in next step");
        machine.setState(new HasMoneyState());
    }

    @Override
    public void chooseProduct(VendingMachine machine, String codeNumber) throws Exception {
        throw new Exception("Cant choose product in Idle State");

    }

    @Override
    public Item dispenseProduct(VendingMachine machine, String codeNumber) throws Exception {
        throw new Exception("Cant dispense product in Idle State");
    }

    @Override
    public int getChange(int returnChangeAmount) throws Exception {
        throw new Exception("Cant return  change  in Idle State");
    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
        throw new Exception("Cant insert coin in Idle State");

    }

    @Override
    public void pressStartSelectionButton(VendingMachine machine) throws Exception {
        throw new Exception("Cant start selection in Idle State");

    }

    @Override
    public List<Coin> refundAmount(VendingMachine machine) throws Exception {
        throw new Exception("Cant refund amount in Idle State");
    }

}
