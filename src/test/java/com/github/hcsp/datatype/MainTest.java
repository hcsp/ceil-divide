package com.github.hcsp.datatype;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MainTest {
    @Test
    public void test() {
        assertEquals(2, Main.ceilDivide(6, 3));
        assertEquals(2, Main.ceilDivide(3, 2));
        assertEquals(3, Main.ceilDivide(8, 3));
    }
}
