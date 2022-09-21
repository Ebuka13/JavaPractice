package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AccountTest{

    @Test
    void depositMoneyTest(){
        //given I have an account
        Account amirahTeensAccount = new Account();
        //when I deposit 3000
        amirahTeensAccount.deposit(3000);
        //check my balance increase by 3000
        int balance = amirahTeensAccount.getbalance();
        assertEquals( 3000, balance);
    }

    @Test
    void negativeDepositShouldNotworkTest(){
        //given I have an account
        Account amirahTeensAccount = new Account();
        //when I deposit 3000
        amirahTeensAccount.deposit(  10000);
        assertEquals(10000,amirahTeensAccount.getbalance());
        //when I deposit -5000
        //check that balance is 10000
        //assertEquals(10000,amirahTeensAccount.getblance());
        }
}
