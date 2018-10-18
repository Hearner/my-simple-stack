package deqo.qcha.mysimplestack;

import java.util.EmptyStackException;
import java.util.Stack;

public class Item implements SimpleStack {

    private Stack stack = new Stack();

    @Override
    public boolean isEmpty() {
        return stack.size() == 0;
    }

    @Override
    public int getSize() {
        return stack.size();
    }

    @Override
    public void push(Item item) {
        stack.push(item);
    }

    @Override
    public Item peek() throws EmptyStackException {
        return (Item) stack.peek();
    }

    @Override
    public Item pop() throws EmptyStackException {
        return (Item) stack.pop();
    }
}
