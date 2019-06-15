package com.github.hcsp.datatype;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    public void test() {
        Assertions.assertEquals(2, Main.ceilDivide(6, 3));
        Assertions.assertEquals(2, Main.ceilDivide(3, 2));
        Assertions.assertEquals(3, Main.ceilDivide(8, 3));
    }
}
