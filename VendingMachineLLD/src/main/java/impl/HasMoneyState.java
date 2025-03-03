package impl;

import dtos.Coin;
import dtos.VendingMachine;
import enums.VendingState;

import java.util.List;

public class HasMoneyState implements MachineState{
        public void insertCoin(VendingMachine vendingMachine, List<Coin> coins) throws Exception{
            // add the coins to balance
            for(Coin coin: coins) {
                vendingMachine.setBalanceAmount(coin.getValue() + vendingMachine.getBalanceAmount());
            }
        }

        // for selecting a product
        public void selectProduct (VendingMachine vendingMachine, int productId) throws Exception{
            vendingMachine.setVendingState(VendingState.SELECTPRODUCT);
        }

        // for payment
        public void pay(VendingMachine vendingMachine) throws Exception{
            throw new Exception("No product selected");
        }

        // for cancelling the product
        public void cancelProduct(VendingMachine vendingMachine, Integer productId) throws Exception{
            throw new Exception("No product selected to cancel");
        }

        public void cancelTransaction(VendingMachine vendingMachine) throws Exception{
            //updateState(vendingMachine, VendingState.IDLE);
            vendingMachine.setVendingState(VendingState.IDLE);
            vendingMachine.refundAmount();
        }

//        public void refundAmount(VendingMachine vendingMachine){
//            System.out.println("Your amount " + vendingMachine.getBalanceAmount() + "refunded");
//        }

//        public void updateState(VendingMachine vendingMachine, VendingState vendingState) throws Exception{
//            vendingMachine.setVendingState(vendingState);
//        }


}
