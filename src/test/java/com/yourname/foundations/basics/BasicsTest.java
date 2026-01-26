package com.yourname.foundations.basics;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BasicsTest {
    @Test
    void isEven_trueFor2() {
        assertTrue(Basics.isEven(2));
    }
    @Test
    void isEven_falseFor3() {
        assertFalse(Basics.isEven(3));
    }
}
