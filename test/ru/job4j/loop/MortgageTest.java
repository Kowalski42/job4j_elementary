package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

public class MortgageTest {
    @Test
    public void whenAmount1000Salary1200rate1Then1Year() {
        int amount = 1000;
        int salary = 1200;
        double percent = 1;
        int result = Mortgage.year(amount, salary, percent);
        int expected = 1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenAmount100Salary120rate50Then1Year() {
        int amount = 100;
        int salary = 120;
        double percent = 50;
        int result = Mortgage.year(amount, salary, percent);
        int expected = 2;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenAmount100Salary70rate50Then4Year() {
        int amount = 100;
        int salary = 70;
        double percent = 50;
        int result = Mortgage.year(amount, salary, percent);
        int expected = 4;
        Assert.assertEquals(expected, result);
    }
}