package impl;

import dtos.Coin;
import dtos.VendingMachine;
import enums.VendingState;

import java.util.List;

public class IdleState implements MachineState{

    public void insertCoin(VendingMachine vendingMachine, List<Coin> coins) throws Exception{
        // update the state
        vendingMachine.setVendingState(new HasMoneyState());

        // add the coins to balance
        Integer insertedAmount = coins.stream().mapToInt(Coin::getValue).sum();
        vendingMachine.setBalanceAmount(vendingMachine.getBalanceAmount() + insertedAmount);
    }

    // for selecting a product
    public void selectProduct (VendingMachine vendingMachine, int productId) throws Exception{
        throw new Exception("Can't select product without coin balance");
    }

    // for payment
    public void pay(VendingMachine vendingMachine) throws Exception{
        throw new Exception("Can't pay as no product selected");
    }

    // for cancelling the product
    public void cancelProduct(VendingMachine vendingMachine, Integer productId) throws Exception{
        throw new Exception("No product selected to cancel");
    }

    public void cancelTransaction(VendingMachine vendingMachine) throws Exception{

    }

}
