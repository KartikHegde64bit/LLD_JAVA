package dtos;

import enums.VendingState;
import impl.HasMoneyState;
import impl.IdleState;
import impl.SelectProductState;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class VendingMachineTest {

    private VendingMachine vendingMachine;
    private Item sampleItem;

    @BeforeEach
    void setup() {
        vendingMachine = new VendingMachine();
        sampleItem = new Item(1, "Soda", 50); // Item with ID 1, Name "Soda", Price 50
    }

    @Test
    void testInitialState() {
        assertEquals(VendingState.IDLE, vendingMachine.getVendingState());
        assertInstanceOf(IdleState.class, vendingMachine.getState());
        assertEquals(0, vendingMachine.getBalanceAmount());
    }

    @Test
    void testInsertCoin() {
        vendingMachine.getState().insertCoin(vendingMachine, Arrays.asList(new Coin(20), new Coin(30)));

        assertEquals(VendingState.HASMONEYSTATE, vendingMachine.getVendingState());
        assertInstanceOf(HasMoneyState.class, vendingMachine.getState());
        assertEquals(50, vendingMachine.getBalanceAmount());
    }

    @Test
    void testSelectProduct() throws Exception {
        vendingMachine.getState().insertCoin(vendingMachine, Arrays.asList(new Coin(50)));
        vendingMachine.getState().selectProduct(vendingMachine, sampleItem);

        assertEquals(VendingState.SELECTPRODUCTSTATE, vendingMachine.getVendingState());
        assertInstanceOf(SelectProductState.class, vendingMachine.getState());
        assertEquals(sampleItem, vendingMachine.getSelectedItem());
    }

    @Test
    void testPayWithExactAmount() throws Exception {
        vendingMachine.getState().insertCoin(vendingMachine, Arrays.asList(new Coin(50)));
        vendingMachine.getState().selectProduct(vendingMachine, sampleItem);
        vendingMachine.getState().pay(vendingMachine);

        assertEquals(0, vendingMachine.getBalanceAmount());
        assertNull(vendingMachine.getSelectedItem());
        assertEquals(VendingState.IDLE, vendingMachine.getVendingState());
    }

    @Test
    void testPayWithExtraAmount() throws Exception {
        vendingMachine.getState().insertCoin(vendingMachine, Arrays.asList(new Coin(100)));
        vendingMachine.getState().selectProduct(vendingMachine, sampleItem);
        vendingMachine.getState().pay(vendingMachine);

        assertEquals(50, vendingMachine.getBalanceAmount()); // Remaining balance should be 50
        assertNull(vendingMachine.getSelectedItem());
        assertEquals(VendingState.IDLE, vendingMachine.getVendingState());
    }

    @Test
    void testPayWithInsufficientBalance() throws Exception {
        vendingMachine.getState().insertCoin(vendingMachine, Arrays.asList(new Coin(20)));
        vendingMachine.getState().selectProduct(vendingMachine, sampleItem);

        Exception exception = assertThrows(Exception.class, () -> vendingMachine.getState().pay(vendingMachine));
        assertEquals("Insufficient balance. Please insert 30 more to proceed.", exception.getMessage());

        assertEquals(20, vendingMachine.getBalanceAmount()); // Balance remains
        assertEquals(sampleItem, vendingMachine.getSelectedItem()); // Product still selected
    }

    @Test
    void testCancelProductSelection() throws Exception {
        vendingMachine.getState().insertCoin(vendingMachine, Arrays.asList(new Coin(50)));
        vendingMachine.getState().selectProduct(vendingMachine, sampleItem);
        vendingMachine.getState().cancelProduct(vendingMachine, sampleItem);

        assertNull(vendingMachine.getSelectedItem());
        assertEquals(VendingState.HASMONEYSTATE, vendingMachine.getVendingState()); // Should still have money
    }

    @Test
    void testCancelTransaction() throws Exception {
        vendingMachine.getState().insertCoin(vendingMachine, Arrays.asList(new Coin(50)));
        vendingMachine.getState().selectProduct(vendingMachine, sampleItem);
        vendingMachine.getState().cancelTransaction(vendingMachine);

        assertEquals(0, vendingMachine.getBalanceAmount());
        assertNull(vendingMachine.getSelectedItem());
        assertEquals(VendingState.IDLE, vendingMachine.getVendingState());
    }
}
