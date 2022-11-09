package ru.netology.sqr.javaqamvn_cycle.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SqrServiceTest {

    @Test
    public void sqrCalc() {
        SqrService service = new SqrService();

        int expected = 22;
        int actual = service.sqrCalc(10, 1000);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void sqrCalc2() {
        SqrService service = new SqrService();

        int expected = 0;
        int actual = service.sqrCalc(10, 99);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void sqrCalc3() {
        SqrService service = new SqrService();

        int expected = 2;
        int actual = service.sqrCalc(11, 123);

        Assertions.assertEquals(expected, actual);
    }
}