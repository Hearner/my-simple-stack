package deqo.qcha.mysimplestack;

import org.junit.Test;

import java.util.EmptyStackException;

import static org.junit.Assert.*;

public class ItemTest {

    @Test
    public void testIsEmpty() {
        SimpleStack stack = new Item();
        assertTrue ("A new stack should be empty ", stack.isEmpty ());
        assertEquals("A new stack has no element", 0, stack.getSize());
    }

    @Test
    public void testGetSize() {
        SimpleStack stack = new Item();
        assertEquals("A new stack as no element", 0, stack.getSize());
        stack.push(new Item());
        assertNotEquals("The stack should not be empty", 0, stack.getSize());
    }

    @Test
    public void testPush() {
        SimpleStack stack = new Item();
        Item item = new Item();
        stack.push(item);
        assertFalse("The stack must not be empty", stack.isEmpty());
        assertEquals("The stack should contain 1 item", 1, stack.getSize());
        assertSame("Pushed item should be on top of stack", item, stack.peek());
    }

    @Test
    public void testPeek() {
        SimpleStack stack = new Item();
        Item item = new Item();
        stack.push(item);
    }

    @Test
    public void testPop() {
        SimpleStack stack = new Item();
        Item item = new Item();
        stack.push(item);
    }

    @Test(expected = EmptyStackException.class)
    public void testPopOnEmptyStack() throws EmptyStackException {
        SimpleStack stack = new Item();
        stack.pop(); // should throw an exception
    }
}