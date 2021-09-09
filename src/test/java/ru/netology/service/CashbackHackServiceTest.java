package ru.netology.service;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();
    int intForMessage;

    @Test
    public void NeedMoreBuy100() {
        int amount = 900;
        int expected = 100;
        intForMessage = expected;

        int actual = service.remain(amount);

        assertEquals(expected, actual);

//        System.out.println("For get bonuses you need buy for " + expected + " rub");

    }

    @Test
    public void NeedMoreBuy10() {
        int amount = 990;
        int expected = 10;
        intForMessage = expected;
        int actual = service.remain(amount);

        assertEquals(expected, actual);

//        System.out.println("For get bonuses you need buy for " + expected + " rub");
    }

    @AfterEach
    private void Message(int intForMessage) {
        System.out.println("For get bonuses you need buy for " + intForMessage + " rub");
    }

}