package com.bridgelabz.Program;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class estMaximumUC1Test {
    @Test
    public void test() {
        TestMaximumUC1 testMax = new TestMaximumUC1();
        int result = testMax.maximum(3,2,1);
        assertEquals(3,result);
    }
    @Test
    public void test1() {
        TestMaximumUC1 testMax = new TestMaximumUC1();
        int result = testMax.maximum(2,3,1);
        assertEquals(3,result);
    }
    @Test
    public void test2() {
        TestMaximumUC1 testMax = new TestMaximumUC1();
        int result = testMax.maximum(2,1,3);
        assertEquals(3,result);
    }
}
