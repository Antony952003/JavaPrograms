package problems;

import java.util.Scanner;

public class validpalindrome {
    static boolean f(String s)
    {
        int n = s.length();
        s = s.toLowerCase();
        String str = "";
        for(int i=n-1;i>=0;i--)
        {
            if(Character.isAlphabetic(s.charAt(i)))
            {
                str += s.charAt(i);
            }
        }
        String str2 = "";
        for(int i=0;i<n;i++)
        {
            if(Character.isAlphabetic(s.charAt(i)))
            {
                str2 += s.charAt(i);
            }
        }
        System.out.println(str);
        System.out.println(str2);
        if(str2.equals(str))
            return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(f(s));
    }
}
