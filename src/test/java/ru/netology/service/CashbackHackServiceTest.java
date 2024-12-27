package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTest {

    @Test
    public void shouldRemainBeforeBoundary() {
        CashbackHackService service = new CashbackHackService();
        Assert.assertEquals(1, service.remain(9999));
    }
    @Test
    public void shouldNoRemainBoundary() {
        CashbackHackService service = new CashbackHackService();
        Assert.assertEquals(0, service.remain(10000));
    }
    @Test
    public void shouldNoRemainAfterBoundary() {
        CashbackHackService service = new CashbackHackService();
        Assert.assertEquals(999, service.remain(10001));
    }
}