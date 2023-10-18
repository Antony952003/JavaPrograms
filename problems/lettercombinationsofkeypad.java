package problems;

import java.util.ArrayList;
import java.util.Scanner;

public class lettercombinationsofkeypad {

    static void f(String p,String str,ArrayList<String> ar)
    {
        if(str.isEmpty()) {
            ar.add(p);
            return;
        }
        
        int digit = str.charAt(0) - '0';
        int i=(digit-2)*3;
        if(digit > 7) {
            i+=1;
        }
        int len = i+3;
        if(digit == 7 || digit == 9) {
            len+=1;
        }
        for(; i<len; i++) {
            char c = (char)('a' + i);
            f(p + c, str.substring(1),ar);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        ArrayList<String> ar = new ArrayList<>();
        f("",num,ar);
        System.out.println(ar);
        
    }
}
