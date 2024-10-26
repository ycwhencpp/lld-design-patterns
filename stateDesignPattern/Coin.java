package stateDesignPattern;

public enum Coin {

    PENNY(1),
    NICKEL(2),
    DIME(10),
    QUARTER(25);

    public int value;

    private Coin(int value) {
        this.value = value;
    }

}
