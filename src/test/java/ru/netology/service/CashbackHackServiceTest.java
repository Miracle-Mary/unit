package ru.netology.service;

import org.testng.annotations.Test;

import org.testng.Assert;

public class CashbackHackServiceTest {

    @Test
    public void shouldRemainBeforeBoundary() {
        CashbackHackService service = new CashbackHackService();
        Assert.assertEquals(service.remain(9999), 1);
    }
    @Test
    public void shouldNoRemainBoundary() {
        CashbackHackService service = new CashbackHackService();
        Assert.assertEquals(service.remain(10000), 0);
    }
    @Test
    public void shouldNoRemainAfterBoundary() {
        CashbackHackService service = new CashbackHackService();
        Assert.assertEquals(service.remain(10001), 999);
    }
}