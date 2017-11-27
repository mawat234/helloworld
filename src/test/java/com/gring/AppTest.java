package com.gring;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AppTest {

    @Test

    public void testSum() {
        int output = App.sum(3, 6);
        assertEquals(9, output);
    }
}
