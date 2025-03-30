package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CashbackHackServiceTest {

    @Test
    public void testRemain() {
       CashbackHackService cashbackHackService = new CashbackHackService();
       int actual = cashbackHackService.remain(50);
       int expected = 950;
       Assert.assertEquals(actual, expected);
    }

    @Test
    public void testRemain2() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int actual = cashbackHackService.remain(-100);
        int expected = 1100;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testRemain3() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int actual = cashbackHackService.remain(0);
        int expected = 1000;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testRemain4() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int actual = cashbackHackService.remain(1000);
        int expected = 0;
        Assert.assertEquals("Пользователь уже совершил покупку на 1000 р.", actual, expected);
    }
}
