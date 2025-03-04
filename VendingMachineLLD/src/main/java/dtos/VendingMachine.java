package dtos;

import enums.VendingState;
import impl.IdleState;
import impl.MachineState;

public class VendingMachine {
    private MachineState state;
    private VendingState vendingState;
    private Integer balanceAmount = 0;
    private Item selectedItem;

    public VendingMachine() {
        this.state = new IdleState();
        this.vendingState = VendingState.IDLE;
    }


    public MachineState getState() {
        return state;
    }

    public void setState(MachineState state) {
        this.state = state;
        // Sync enum state for logging/debugging
        this.vendingState = VendingState.valueOf(state.getClass().getSimpleName().toUpperCase());
    }

    public Item getSelectedItem() {
        return selectedItem;
    }

    public void setSelectedItem(Item selectedItem) {
        this.selectedItem = selectedItem;
    }

    public Integer getBalanceAmount() {
        return balanceAmount;
    }

    public void setBalanceAmount(Integer balanceAmount) {
        this.balanceAmount = balanceAmount;
    }


    public VendingState getVendingState() {
        return vendingState;
    }

    public void setVendingState(VendingState vendingState) {
        this.vendingState = vendingState;
    }

    public void refundAmount(){
        System.out.println("Your Amount: " + this.balanceAmount + "has been refunded");
        this.balanceAmount = 0;
    }
}
