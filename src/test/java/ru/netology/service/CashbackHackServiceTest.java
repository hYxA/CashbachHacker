package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void NeedMoreBuy100() {
        int amount = 900;
        int expected = 100;
//        intForMessage = expected;

        int actual = service.remain(amount);

        assertEquals(expected, actual);

        System.out.println("For get bonuses you need buy for " + expected + " rub");

    }

    @Test
    public void NeedMoreBuy10() {
        int amount = 990;
        int expected = 10;
//        intForMessage = expected;
        int actual = service.remain(amount);

        assertEquals(expected, actual);

        System.out.println("For get bonuses you need buy for " + expected + " rub");
    }
    @Test
    public void NeedMoreBuy1000() {
        int amount = 1000;
        int expected = 0;
//        intForMessage = expected;
        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }

    @Test
    public void NoNeedMoreBuy2000() {
        int amount = 2000;
        int expected = 0;
//        intForMessage = expected;
        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }

//    @AfterEach
//    public void Message(int expected) {
//        System.out.println("For get bonuses you need buy for " + expected + " rub");
//    }

}