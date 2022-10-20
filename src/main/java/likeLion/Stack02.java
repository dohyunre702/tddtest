package likeLion;

public class Stack02 {

    private final Integer[] arr; //stack 초기화

    public Integer[] getArr() { //getter
        return arr;
    }

    public Stack02() {
        this.arr = new Integer[10000];
    }

    public Stack02(int size) {
        this.arr = new Integer[10000];
    }
    public void push(int value) {
        //10 넣으면 arr[0] = 10
    }

    public void pop(int value) {
    }
}
