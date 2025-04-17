package lang.wrapper;

public class MyInteger {

    private final int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public int compareTo(MyInteger target) {
        if(value < target.value) {
            return -1;
        } else if (value > target.value) {
            return 1;
        }else{
            return 0;
        }
    }

    @Override
    public String toString() {
        return "MyInteger{" +
                "value=" + value +
                '}';
    }
}
