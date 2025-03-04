package impl;

import dtos.Coin;
import dtos.Item;
import enums.VendingState;
import dtos.VendingMachine;

import java.util.List;

public interface MachineState {
    // for inserting the coin into machine
    public void insertCoin(VendingMachine vendingMachine, List<Coin> coins);

    // for selecting a product
    public void selectProduct(VendingMachine vendingMachine, Item item);

    // for payment
    public void pay(VendingMachine vendingMachine);

    // for cancelling the product
    public void cancelProduct(VendingMachine vendingMachine, Item item);

    public void cancelTransaction(VendingMachine vendingMachine);

    public void dispenseProduct(VendingMachine vendingMachine);
}
