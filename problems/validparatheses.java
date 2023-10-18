package problems;

import java.util.Scanner;
import java.util.Stack;

public class validparatheses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char arr[] = s.toCharArray();
        int n = arr.length;
        Stack<Character> st = new Stack<>();
        for(int i=0;i<n;i++)
        {
            if(arr[i]=='(' || arr[i]=='[' || arr[i]=='{')
                st.push(arr[i]);
            else if(arr[i]==')' && st.peek()=='(' && !st.isEmpty())
                st.pop();
            else if(arr[i]==']' && st.peek()=='[' && !st.isEmpty())
                st.pop();
            else if(arr[i]=='}' && st.peek()=='{' && !st.isEmpty())
                st.pop();
         }
        if(st.isEmpty())
        {
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
