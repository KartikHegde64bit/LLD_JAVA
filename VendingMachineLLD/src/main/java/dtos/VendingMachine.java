package dtos;

import enums.VendingState;
import impl.MachineState;

public class VendingMachine {

    private MachineState vendingState;

    public Integer getBalanceAmount() {
        return balanceAmount;
    }

    public void setBalanceAmount(Integer balanceAmount) {
        this.balanceAmount = balanceAmount;
    }

    private Integer balanceAmount = 0;

    public MachineState getVendingState() {
        return vendingState;
    }

    public void setVendingState(MachineState vendingState) {
        this.vendingState = vendingState;
    }

    public void refundAmount(){
        System.out.println("Your Amount: " + this.balanceAmount + "has been refunded");
        this.balanceAmount = 0;
    }
}
