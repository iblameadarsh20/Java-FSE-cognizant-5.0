package com.adarsh.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BankAccountTest {

    private BankAccount account;

    @BeforeEach
    void setup() {
        System.out.println("Setting up...");
        account = new BankAccount(1000);
    }

    @AfterEach
    void teardown() {
        System.out.println("Cleaning up...");
    }

    @Test
    void testDeposit() {

        // Arrange
        double amount = 500;

        // Act
        account.deposit(amount);

        // Assert
        assertEquals(1500, account.getBalance());

    }

    @Test
    void testWithdraw() {

        // Arrange
        double amount = 300;

        // Act
        account.withdraw(amount);

        // Assert
        assertEquals(700, account.getBalance());

    }
}