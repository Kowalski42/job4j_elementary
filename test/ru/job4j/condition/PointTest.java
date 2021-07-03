package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;
import static ru.job4j.condition.Point.*;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = new Point(x1, y1).distance(new Point(x2, y2));
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when01to0minus9then2() {
        double expected = 10;
        int x1 = 0;
        int y1 = 1;
        int x2 = 0;
        int y2 = -9;
        double out = new Point(x1, y1).distance(new Point(x2, y2));
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00to1010then14point14() {
        double expected = 14.14;
        int x1 = 0;
        int y1 = 0;
        int x2 = 10;
        int y2 = 10;
        double out = new Point(x1, y1).distance(new Point(x2, y2));
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when01to110then9point06() {
        double expected = 9.06;
        int x1 = 0;
        int y1 = 1;
        int x2 = 1;
        int y2 = 10;
        double out = new Point(x1, y1).distance(new Point(x2, y2));
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when041to005then5point66() {
        double expected = 5.66;
        int x1 = 0;
        int y1 = 4;
        int z1 = 1;
        int x2 = 0;
        int y2 = 0;
        int z2 = 5;
        double out = new Point(x1, y1, z1).distance3d(new Point(x2, y2, z2));
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when1610to005then7point87() {
        double expected = 7.87;
        int x1 = 1;
        int y1 = 6;
        int z1 = 10;
        int x2 = 0;
        int y2 = 0;
        int z2 = 5;
        double out = new Point(x1, y1, z1).distance3d(new Point(x2, y2, z2));
        Assert.assertEquals(expected, out, 0.01);
    }
}