package com.example.divan.fibionacciproject;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class FiboUnitTest {
    MainActivity main;
    @Test
    public void CheckFibo() {
        assertNotEquals(main.fibo(),"thrrh");
    }
}