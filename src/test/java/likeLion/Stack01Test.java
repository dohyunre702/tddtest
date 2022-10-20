package likeLion;

//push and pop
import likeLion.Stack01;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Stack01Test {

    @Test
    void pushTest() {
        Stack01 stack01 = new Stack01();
        stack01.push(10);
        stack01.push(20);

        int[] arr = stack01.getArr();
        //10,20
        Assertions.assertEquals(10,arr[0]);
        Assertions.assertEquals(20,arr[1]);
    }


    @Test
    @DisplayName("'push and pop' is done well")
    void pushAndPop() {
        Stack01 stack01 = new Stack01();
        stack01.push(10);
        stack01.push(20);

        Assertions.assertEquals(20, stack01.pop());
        Assertions.assertEquals(10, stack01.pop());

        stack01.push(30);
        Assertions.assertEquals(30, stack01.pop());
    }

}

