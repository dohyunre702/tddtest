package likeLion;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;

import static org.junit.jupiter.api.Assertions.*;
//setup before 사용
class Stack02Test {
    Stack02 st = new Stack02();

    @BeforeEach //각 테스트가 실행되기 전에 실행되는 구간.
    void setUp() {
        st.push(10);
        st.push(20);
    }

    @Test
    @DisplayName("push가 잘 되는지")
    void push() {
        Stack02 st = new Stack02();
        st.push(10);
        st.push(20);
        Integer[] arr = st.getArr();
        assertEquals(20, arr[1]);
        assertEquals(10, arr[1]);
    }

    @Test
    void pushAndPop() {
        Stack02 st = new Stack02();
        st.push(10);
        st.push(20);
    }

    @Test
    void isEmpty() {
        Stack02 st = new Stack02();
        assertTrue(st.isEmpty());
        st.push(10);
        assertFalse(st.isEmpty());
        st.pop();
        asserTrue(st.isEmpty());
    }
    @Test
    void peek() {
        Stack02 st = new Stack02();
        assertThrows(EmptyStackException.class,()-> {
            st.peek();
        });
        st.push(10);
        int peeked = st.peek();
        assertEquals(10, peeked);
    }

    @Test
    void realSteak() {
        Stack<Integer> =

    }
}