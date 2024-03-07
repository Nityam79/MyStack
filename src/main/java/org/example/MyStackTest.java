package org.example;

import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

public class MyStackTest {

    @Test
    public void testPushAndPop() {
        MyStack<Integer> stack = new MyStack<>();
        assertTrue(stack.isEmpty());

        stack.push(1);
        assertFalse(stack.isEmpty());
        assertEquals(1, stack.pop());
        assertTrue(stack.isEmpty());
    }

    @Test
    public void testPopEmptyStack() {
        MyStack<Integer> stack = new MyStack<>();
        assertThrows(EmptyStackException.class, stack::pop);
    }
}
