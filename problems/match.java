package problems;
import java.util.*;
public class match{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string :");
        String str = sc.nextLine();
        System.out.println("Enter the pattern to be matched :");
        String p = sc.nextLine();
        int index,i,j;
        boolean flag = false;
        for(i=0;i<str.length();i++)
        {
            j=0;
            index = i;
            while(str.charAt(i)==p.charAt(j))
            {
                i++;
                j++;

                if(j == p.length())
                {
                    System.out.println("String found at location : "+(index+1));
                    flag = true;
                    break;
                }
            }
        }
        if(!flag)
        {
            System.out.println("Given pattern is not matched to the string");
        }


    }
}