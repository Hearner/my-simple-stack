package deqo.qcha.mysimplestack;

import java.util.EmptyStackException;
import java.util.Stack;

public class SimpleStackImpl implements SimpleStack {

    /**
     *
     */
    Stack<Object> wrappedStack = new Stack<Object>();

    /**
     *
     * @return
     */
    public boolean isEmpty() {
        return wrappedStack.isEmpty();
    }

    /**
     *
     * @return
     */
    public int getSize() {
        return wrappedStack.size();
    }

    /**
     *
     * @param item
     */
    public void push(Item item) {
        wrappedStack.push(item);
    }

    /**
     *
     * @return
     * @throws EmptyStackException
     */
    public Item peek() throws EmptyStackException {
        return (Item) wrappedStack.peek();
    }

    /**
     *
     * @return
     * @throws EmptyStackException
     */
    public Item pop() throws EmptyStackException {
        return (Item) wrappedStack.pop();
    }
}