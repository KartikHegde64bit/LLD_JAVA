package impl;

import dtos.Coin;
import dtos.Item;
import dtos.VendingMachine;
import enums.VendingState;

import java.util.List;

public class IdleState implements MachineState{

    public void insertCoin(VendingMachine vendingMachine, List<Coin> coins){
        // update the state
        vendingMachine.setState(new HasMoneyState());
        //vendingMachine.setVendingState(VendingState.HASMONEY);
        // add the coins to balance
        Integer insertedAmount = coins.stream().mapToInt(Coin::getValue).sum();
        vendingMachine.setBalanceAmount(vendingMachine.getBalanceAmount() + insertedAmount);
    }

    // for selecting a product
    public void selectProduct (VendingMachine vendingMachine, Item item){
        System.out.println("Can't select product without coin balance");
    }

    // for payment
    public void pay(VendingMachine vendingMachine){
        System.out.println("Can't pay as no product selected");
    }

    // for cancelling the product
    public void cancelProduct(VendingMachine vendingMachine, Item item){
        System.out.println("No product selected to cancel");
    }

    public void cancelTransaction(VendingMachine vendingMachine){
        System.out.println("Not possible to cancel transaction");
    }

    public void dispenseProduct(VendingMachine vendingMachine){
        System.out.println("Can't dispense item");
    }

}
