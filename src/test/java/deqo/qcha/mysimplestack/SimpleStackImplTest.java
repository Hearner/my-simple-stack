package deqo.qcha.mysimplestack;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.EmptyStackException;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class SimpleStackImplTest {

    @Test (expected = EmptyStackException.class)
    public void isEmptyExceptionTest() {
        SimpleStack stack = new SimpleStackImpl();
        stack.pop();
    }

    @Test
    public void getSizeTest() {
        SimpleStack stack = new SimpleStackImpl();
        Item item = new Item(new Object());
        assertTrue("The stack has no element", stack.getSize() == 0);
        stack.push(item);
        assertTrue("The stack has one element", stack.getSize() == 1);
    }

    @Test
    public void pushTest() {
        SimpleStack stack = new SimpleStackImpl();
        Item item = new Item(new Object());
        stack.push(item);
        assertFalse("The stack must not be empty", stack.isEmpty());
        assertEquals("There must be one element", 1, stack.getSize());
        assertSame("Pushed item must be on top of the stack", item, stack.peek());
    }

    @Test
    public void peekTest() {
        SimpleStack stack = new SimpleStackImpl();
        Item item = new Item(new Object());
        assertTrue("There must be no element", stack.isEmpty());
        stack.push(item);
        assertEquals("Size must be one", 1,stack.getSize());
        Item newitem = stack.peek();
        assertTrue("Size must still stay the same", !stack.isEmpty());
        assertSame("The item peeked must be the item added", item, newitem);
    }

    @Test (expected = EmptyStackException.class)
    public void popExceptionTest() {
        SimpleStack stack = new SimpleStackImpl();
        stack.pop();
    }

    @Test
    public void popTest() {
        SimpleStack stack = new SimpleStackImpl();
        assertTrue("There must be no element", stack.isEmpty());
        Item item = new Item(new Object());
        stack.push(item);
        assertFalse("There must not be no element", stack.isEmpty());
        Item newitem = stack.pop();
        assertTrue("There must be no element now one had been removed", stack.isEmpty());
        assertSame("The item poped must be the item added", item, newitem);
    }
}