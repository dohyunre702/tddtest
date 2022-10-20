package likeLion;

import java.util.EmptyStackException;

public class Stack02 {

    private final Integer[] arr; //stack 초기화
    private int top;

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

    public boolean isEmpty() {
        boolean isEmpty = this.top == 0;
        return isEmpty;
    }

    public int peek() {
        if (isEmpty()) throw new EmptyStackException();
            return this.arr[this.top -1];
        }

        public int pop() {
            if (this.isEmpty())
                throw new RuntimeException("스택이 비었습니다.");
            return this.arr[--this.top];
        }
    }
