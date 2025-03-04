package impl;

import dtos.Coin;
import dtos.Item;
import dtos.VendingMachine;
import enums.VendingState;

import java.util.List;

public class HasMoneyState implements MachineState{
        public void insertCoin(VendingMachine vendingMachine, List<Coin> coins){
            // add the coins to balance
            for(Coin coin: coins) {
                vendingMachine.setBalanceAmount(coin.getValue() + vendingMachine.getBalanceAmount());
            }
        }

        // for selecting a product
        public void selectProduct (VendingMachine vendingMachine, Item item){
            //vendingMachine.setVendingState(VendingState.SELECTPRODUCT);
            vendingMachine.setState(new SelectProductState());
        }

        // for payment
        public void pay(VendingMachine vendingMachine){
            System.out.println("No product selected");
        }

        // for cancelling the product
        public void cancelProduct(VendingMachine vendingMachine, Item item){
            System.out.println("No product selected to cancel");
        }

        public void cancelTransaction(VendingMachine vendingMachine){
            //updateState(vendingMachine, VendingState.IDLE);
            //vendingMachine.setVendingState(VendingState.SELECTPRODUCT);
            vendingMachine.setState(new IdleState());
            vendingMachine.refundAmount();
        }

        public void dispenseProduct(VendingMachine vendingMachine){
            System.out.println("Can't dispense item");
        }

//        public void refundAmount(VendingMachine vendingMachine){
//            System.out.println("Your amount " + vendingMachine.getBalanceAmount() + "refunded");
//        }

//        public void updateState(VendingMachine vendingMachine, VendingState vendingState) throws Exception{
//            vendingMachine.setVendingState(vendingState);
//        }


}
