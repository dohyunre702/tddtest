package likeLion;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
//setup before 사용
class Stack02Test {

    @BeforeEach //각 테스트가 실행되기 전에 실행되는 구간.
    void setUp() {
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

        assertEquals(20, st.pop());
        assertEquals(10, st.pop());



    }
}