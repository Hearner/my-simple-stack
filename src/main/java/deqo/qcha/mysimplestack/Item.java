package deqo.qcha.mysimplestack;

public class Item {
    private Object value;

    /**
     *
     * @param value
     */
    Item(Object value) {
        setValue(value);
    }

    /**
     *
     * @return
     */
    public Object getValue() {
        return value;
    }

    /**
     *
     * @param value
     */
    public void setValue(Object value) {
        this.value = value;
    }
}