package impl;

import dtos.Coin;
import dtos.Item;
import dtos.VendingMachine;
import enums.VendingState;

import java.util.List;

public class SelectProductState implements MachineState{
    public void insertCoin(VendingMachine vendingMachine, List<Coin> coins){
        System.out.println("Cannot insert additional coin during selection");
    }

    // for selecting a product
    public void selectProduct (VendingMachine vendingMachine, Item item){
        vendingMachine.setSelectedItem(item);
        System.out.println("Product selected: " + item.getName());
    }

    // for payment
    public void pay(VendingMachine vendingMachine){
        Item item = vendingMachine.getSelectedItem();
        Integer diff = item.getValue() - vendingMachine.getBalanceAmount();
        if(diff > 0) {
            System.out.println("Insufficient Balance!");
            System.out.println("You need more " + diff + "amount");
            return;
        }
        vendingMachine.setBalanceAmount(diff * -1);
        // Move to DispenseState and dispense product
        vendingMachine.setState(new DispenseState());
        //vendingMachine.getState().dispenseProduct(vendingMachine);
    }

    // for cancelling the product
    public void cancelProduct(VendingMachine vendingMachine, Item item){
        vendingMachine.setSelectedItem(null);
        System.out.println("No product selected to cancel");
    }

    public void cancelTransaction(VendingMachine vendingMachine){

        vendingMachine.setState(new IdleState());
        vendingMachine.refundAmount();
    }

    public void dispenseProduct(VendingMachine vendingMachine){
        System.out.println("Can't dispense product");
    }
}
