package impl;

import dtos.Coin;
import dtos.Item;
import dtos.VendingMachine;

import java.util.List;

public class DispenseState implements MachineState{
    public void insertCoin(VendingMachine vendingMachine, List<Coin> coins){
        System.out.println("Cannot insert additional coin during selection");
    }

    // for selecting a product
    public void selectProduct (VendingMachine vendingMachine, Item item){
        System.out.println("Cannot select the product while dispensing");
    }

    // for payment
    public void pay(VendingMachine vendingMachine){
        System.out.println("Already paid");
    }

    // for cancelling the product
    public void cancelProduct(VendingMachine vendingMachine, Item item){
        System.out.println("Can't cancel item here");
    }

    public void cancelTransaction(VendingMachine vendingMachine){
        System.out.println("Can't cancel the transaction");
    }

    public void dispenseProduct(VendingMachine vendingMachine){
        Item selectedItem = vendingMachine.getSelectedItem();
        if (selectedItem == null) {
            System.out.println("No product selected to dispense.");
            vendingMachine.setState(new IdleState());
            return;
        }

        System.out.println("Dispensing: " + selectedItem.getName());
        if(vendingMachine.getBalanceAmount() > 0) {
            System.out.println("Refunding the balance: " + vendingMachine.getBalanceAmount());
            vendingMachine.refundAmount();
        }

        vendingMachine.setSelectedItem(null);
        vendingMachine.setState(new IdleState());
    }
}
