package com.classTest;

import org.junit.Test;

/**
 * Author:zhou-study
 * Other: 2021/8/31 - 22:17
 */

public class AccountTest {
    @Test
    public void test(){
        Customer customer = new Customer("Smith","Jane");
        Account account = new Account(1000, 2000, 0.0123);

        account.deposit(100);
        account.withdraw(960);
        account.withdraw(2000);

        customer.setAccount(account);
        customer.toString();
    }
}
