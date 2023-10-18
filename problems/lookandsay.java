package problems;
import java.util.*;
public class lookandsay{
    public static String look(int n)
    {
        if(n==1)
        {
            return "1";
        }
        if(n==2)
        {
            return "11";
        }
        String result = look(n-1);
        char arr[] = result.toCharArray();
        int count = 1;
        String newresult = "";
        for(int i=1;i<result.length();i++)
        {
            if(arr[i]!=arr[i-1])
            {
                newresult += count;
                newresult += arr[i-1];
                count = 1;
            }
            else{
                count++;
            }
            if(i == result.length()-1)
            {
                newresult += count;
                newresult += arr[i];
            }
        }
        return newresult;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(look(n));
        
    }
}