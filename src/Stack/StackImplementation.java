package Stack;
import java.util.Scanner;
import java.util.Stack;

public class StackImplementation {
    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();
        st.push(3);   //add function
        st.pop();          //remove function
        st.peek();      //top of the stack
        st.size();      //size of the stack
        st.isEmpty();  //is Check whether is empty or not
        System.out.println(st);
    }
}
