package stateDesignPattern.states;

import java.util.List;

import stateDesignPattern.Coin;
import stateDesignPattern.Item;
import stateDesignPattern.VendingMachine;

public class HasMoneyState implements state {

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
        System.out.println("Inserting coin " + coin);
        machine.getMoneyStore().add(coin);
        System.out.println("Please press Start Sleection Button now");

    }

    @Override
    public void pressStartSelectionButton(VendingMachine machine) throws Exception {
        if (machine.getMoneyStore().size() == 0) {
            throw new Exception("Please Add money first");
        }
        machine.setState(new SelectionState());
    }

    @Override
    public List<Coin> refundAmount(VendingMachine machine) throws Exception {
        machine.setState(new IdleState(machine));
        return machine.getMoneyStore();
    }

    @Override
    public void chooseProduct(VendingMachine machine, String codeNumber) throws Exception {
        throw new Exception("Cant choose product in HasMoney State");

    }

    @Override
    public Item dispenseProduct(VendingMachine machine, String codeNumber) throws Exception {
        throw new Exception("Cant dispense product in HasMoney State");
    }

    @Override
    public int getChange(int returnChangeAmount) throws Exception {
        throw new Exception("Cant get change in HasMoney State");
    }

    @Override
    public void pressInsertCashButton(VendingMachine machine) throws Exception {
        throw new Exception("Cant press cashButton in HasMoney State");

    }

}
