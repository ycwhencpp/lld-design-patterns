package stateDesignPattern.states;

import stateDesignPattern.Item;

import java.util.List;

import stateDesignPattern.Coin;
import stateDesignPattern.VendingMachine;

/**
 * state
 */
public interface state {
    public void pressInsertCashButton(VendingMachine machine) throws Exception;

    public void pressStartSelectionButton(VendingMachine machine) throws Exception;

    public void insertCoin(VendingMachine machine, Coin coin) throws Exception;

    public void chooseProduct(VendingMachine machine, String codeNumber) throws Exception;

    public int getChange(int returnChangeAmount) throws Exception;

    public Item dispenseProduct(VendingMachine machine, String codeNumber) throws Exception;

    public List<Coin> refundAmount(VendingMachine machine) throws Exception;

}
