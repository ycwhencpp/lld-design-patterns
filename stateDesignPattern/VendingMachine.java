package stateDesignPattern;

import java.util.ArrayList;
import java.util.List;

import stateDesignPattern.states.IdleState;
import stateDesignPattern.states.state;

public class VendingMachine {
    public state machineState;
    public List<Item> items;
    public List<Coin> moneyStore;

    public VendingMachine() {
        this.machineState = new IdleState();
        this.items = new ArrayList<>();
        this.moneyStore = new ArrayList<>();
    }

    public state getState() {
        return this.machineState;
    }

    public void setState(state newMachineState) {
        this.machineState = newMachineState;
    }

    public List<Item> getitems() {
        return this.items;
    }

    public void setItems(List<Item> newListItesms) {
        this.items = newListItesms;
    }

    public List<Coin> getMoneyStore() {
        return this.moneyStore;
    }

    public void setMoneyStore(List<Coin> newMoneyStore) {
        this.moneyStore = newMoneyStore;
    }

}
