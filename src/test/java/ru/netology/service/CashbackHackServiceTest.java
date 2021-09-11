package ru.netology.service;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();
    int expected;

    @Test
    public void NeedMoreBuy100() {
        int amount = 900;
        expected = 100;
        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }

    @Test
    public void NeedMoreBuy10() {
        int amount = 990;
        expected = 10;
        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }

    @Test
    public void NeedMoreBuy1000() {
        int amount = 1000;
        expected = 0;
        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }

    @Test
    public void NoNeedMoreBuy2000() {
        int amount = 2000;
        expected = 0;
        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }

    @AfterEach
    public void Message(int expected) {
        System.out.println("For get bonuses you need buy for " + expected + " rub");
    }

}