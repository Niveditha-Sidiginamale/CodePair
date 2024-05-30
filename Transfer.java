package com.example.demo;

public class Transfer {

    void transfer(Account from, Account to, int amount) {
        synchronized (from) {
            synchronized (to) { // Execution Issue : Nested synchronized blocks, without the execution order might lead to Deadlocks
                from.debit(amount); // Functional Issue : Sufficient Balance from "FROM" Account is not considered before debiting the amount which could to -ve balances.
                to.credit(amount);
            }
        }

    }

}
