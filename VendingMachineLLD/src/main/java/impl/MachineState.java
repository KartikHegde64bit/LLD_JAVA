package impl;

import dtos.Coin;
import enums.VendingState;
import dtos.VendingMachine;

import java.util.List;

public interface MachineState {
    // for inserting the coin into machine
    public void insertCoin(VendingMachine vendingMachine, List<Coin> coins) throws Exception;

    // for selecting a product
    public void selectProduct(VendingMachine vendingMachine, int productId) throws Exception;

    // for payment
    public void pay(VendingMachine vendingMachine) throws Exception;

    // for cancelling the product
    public void cancelProduct(VendingMachine vendingMachine, Integer productId) throws Exception;

    public void cancelTransaction(VendingMachine vendingMachine) throws Exception;

    //public void refundAmount(VendingMachine vendingMachine) throws Exception;

    //public void updateState(VendingMachine vendingMachine, VendingState vendingState) throws Exception;
}
