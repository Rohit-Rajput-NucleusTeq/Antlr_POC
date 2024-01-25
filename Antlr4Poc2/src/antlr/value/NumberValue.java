package antlr.value;

public class NumberValue extends Value{
	
	private final int value ;

    public NumberValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
