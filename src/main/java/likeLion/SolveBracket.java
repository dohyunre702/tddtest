package likeLion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SolveBracket {


    public boolean solution (String a) {
        //char 배열로 변환
        char[] arr = a.toCharArray(); //.toCharArray() : String 문자열을 char 배열로 변환하는 메서드

        if (arr[arr.length-1] == (")").charAt(0)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        SolveBracket result = new SolveBracket();
        System.out.println(result.solution(input));
    }
}