package lec1;

import java.util.Stack;

public class stack {

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println("Removed:" + st.pop());
        System.out.println(st.isEmpty());
        System.out.println(st.peek());//last element 
        System.out.println(st);

        Stack<Character> ch = new Stack<>();
        ch.push('D');
        ch.push('E');
        ch.push('E');
        ch.push('P');
        ch.push('S');
        System.out.println(ch);
        while (!ch.isEmpty()) {
            System.out.println(ch.pop());
        }

        System.out.println(ch.isEmpty());
    }
}
