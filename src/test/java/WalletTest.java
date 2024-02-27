import org.example.Wallet;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WalletTest {
    @Test
    void testWithdraw(){
        Wallet wallet = new Wallet("joko", 123, new ArrayList<>());
        wallet.withdraw(10);
        assertEquals(113, wallet.uangCash);
    }

    @Test
    void testDeposit(){
        Wallet wallet2 = new Wallet("naiya", 123, new ArrayList<>());
        wallet2.deposit(10);
        assertEquals(133, wallet2.uangCash);
    }
    @Test
    void testAddCard(){
        Wallet wallet = new Wallet("naiyaa",215, new  ArrayList<>());
        wallet.addCard("Kartu kredit");
        assertEquals(1, wallet.listKartu.size());
    }
    @Test
    void testRemoveCard(){
        Wallet wallet = new Wallet("innaiya", 54, new ArrayList<>());
        wallet.addCard("kartu kredit");
        wallet.removeCard("kartu kredit");
        assertEquals(0, wallet.listKartu.size());
    }
    @Test
    void testAddCash(){
        Wallet wallet = new Wallet("azkiya", 175, new ArrayList<>());
        wallet.addCash(70);
        assertEquals(245, wallet.uangCash);
    }
    @Test
    void testWithdrawCash(){
        Wallet wallet = new Wallet("kiya", 154, new ArrayList<>());
        wallet.withdrawCash(50);
        assertEquals(104, wallet.uangCash);
    }
    @Test
    void testDisplayCash(){
        Wallet wallet = new Wallet("innaiya azkiya", 254, new ArrayList<>());
        assertEquals(254, wallet.displayCash());
    }
}
