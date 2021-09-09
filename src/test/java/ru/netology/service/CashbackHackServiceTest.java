package ru.netology.service;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @org.junit.jupiter.api.Test
    public void NeedMoreBuy100() {
        int amount = 900;
        int expected = 100;

        int actual = service.remain(amount);
        org.junit.jupiter.api.Assertions.assertEquals(actual, expected);

        System.out.println("For get bonuses you need buy for " + expected + " rub");

    }

    @org.junit.jupiter.api.Test
    public void NeedMoreBuy10() {
        int amount = 990;
        int expected = 10;
        int actual = service.remain(amount);

        org.junit.jupiter.api.Assertions.assertEquals(actual, expected);

        System.out.println("For get bonuses you need buy for " + expected + " rub");
    }

    @org.junit.jupiter.api.Test
    public void NoNeedMoreBuy1000() {
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);

        org.junit.jupiter.api.Assertions.assertEquals(actual, expected);
    }

    @org.junit.jupiter.api.Test
    public void NoNeedMoreBuy2000() {
        int amount = 2000;
        int expected = 0;
        int actual = service.remain(amount);

        org.junit.jupiter.api.Assertions.assertEquals(actual, expected);
    }

    @org.junit.Test
    public void NeedMoreBuy100JUnit4() {
        int amount = 900;
        int expected = 100;

        int actual = service.remain(amount);
        org.junit.Assert.assertEquals(actual, expected);

        System.out.println("For get bonuses you need buy for " + expected + " rub");

    }

    @org.junit.Test
    public void NeedMoreBuy10JUnit4() {
        int amount = 990;
        int expected = 10;
        int actual = service.remain(amount);

        org.junit.Assert.assertEquals(actual, expected);

        System.out.println("For get bonuses you need buy for " + expected + " rub");
    }

    @org.junit.Test
    public void NoNeedMoreBuy1000JUnit4() {
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);

        org.junit.Assert.assertEquals(actual, expected);
    }

    @org.junit.Test
    public void NoNeedMoreBuy2000JUnit4() {
        int amount = 2000;
        int expected = 0;
        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }
}