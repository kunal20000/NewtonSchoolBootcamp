package Stack;

import java.sql.SQLOutput;
import java.util.Stack;

public class StackBasics {





    public static void main(String[] args) {
        Stack<String> st = new Stack<>();


        st.push("kunal");
        st.push("asthwth");
        st.push("ujjwal");
        st.push("punit");
        st.push("Gaurav");

        System.out.println(st);

        // peek (last element to top element)
        System.out.println(st.peek());
        System.out.println(st);

        System.out.print(st.pop());
        System.out.println(st);
        st.add("gaurav");
        st.add("pranay");
        st.add("akash");
        st.add("mayur");

        System.out.println(st.contains("gaurav"));
        System.out.println(st.contains("shubham"));

    }
}
