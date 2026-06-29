package com.adarsh.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class AssertionsTest {

    StringOperations obj = new StringOperations();

    @Test
    void testAssertEquals() {
        assertEquals(30, obj.add(10, 20));
    }

    @Test
    void testAssertTrue() {
        assertTrue(obj.isEven(10));
    }

    @Test
    void testAssertFalse() {
        assertFalse(obj.isEven(9));
    }

    @Test
    void testAssertNotNull() {
        assertNotNull(obj.getMessage());
    }

    @Test
    void testAssertNull() {
        assertNull(obj.getNullValue());
    }

    @Test
    void testAssertThrows() {
        assertThrows(ArithmeticException.class, () -> {
            obj.divide(10, 0);
        });
    }
}