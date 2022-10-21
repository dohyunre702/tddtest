package likeLion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SolveBracket {


    public void solution (String a) {
        //char 배열로 변환
        char[] arr = new char[a.length()];
        for (int i = 0; i < a.length(); i++) {
            arr[i] = (char) a.indexOf(i); // 에러. a.indexOf(i)는 -1 or 0 반환.
        }

        if (arr[arr.length-1] == (")").charAt(0)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        SolveBracket result = new SolveBracket();
        result.solution(input); //무조건 false 반환. ")"가 배열에 제대로 들어가지 않았기 때문.

    }
}