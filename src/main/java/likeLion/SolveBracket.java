package likeLion;

import java.util.Stack;

public class SolveBracket {
        public boolean solution(String s) {
            Stack<Character> st = new Stack<>();
            for (int i = 0; i <s.length(); i++) {
                if('(' == s.charAt(i)) {
                    st.push(s.charAt(i));
                } else if (')' == s.charAt(i)) {
                    if (st.empty()) return false;
                    st.pop();
                }
            }
            return st.empty();
        }
}
