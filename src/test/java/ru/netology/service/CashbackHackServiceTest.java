package ru.netology.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();
    private int expected;

    @Test
    public int NeedMoreBuy100() {
        int amount = 900;
        expected = 100;
        int actual = service.remain(amount);

        assertEquals(expected, actual);

        return expected;

    }

    @Test
    public int NeedMoreBuy10() {
        int amount = 990;
        expected = 10;
        int actual = service.remain(amount);

        assertEquals(expected, actual);

        return expected;
//        System.out.println("For get bonuses you need buy for " + expected + " rub");
    }

    @BeforeEach
    private void Message(int expected) {
        System.out.println("For get bonuses you need buy for " + expected + " rub");
    }

}