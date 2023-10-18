package problems;
import java.util.*;
public class robin{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "antonyjeson";
        String p = "jes";
        int strlen = str.length();
        int patlen = p.length();
        int sum = 0;
        boolean flag = false;
        int sum2;
        int index;
        for(int i=0;i<patlen;i++)
        {
            sum += (p.charAt(i)) * (int)Math.pow(127, patlen - (i+1));
        }
        for(int i=0;i<strlen;i++)
        {
            sum2 = 0;
            index = i;
            String temp = str.substring(i, patlen + i);
            for(int j=0;j<patlen;j++)
            {
                sum2 += (temp.charAt(j)) * (int)Math.pow(127, patlen - (j+1));
            }
            if(sum==sum2)
            {
                System.out.println("The pattern is found at location : "+(index+1));
                flag = true;
                break;
            }
        }
        if(!flag)
        {
            System.out.println("The pattern is not found in the given string");
        }
    }
}