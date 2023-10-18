package problems;
import java.util.*;
public class reverseit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String s = "";
        char arr[] = str.toCharArray();

        int i = str.length()-1;
        while(i>=0)
        {
            while(Character.isAlphabetic(arr[i]))
            {
                i--;
                //System.out.println("Value of i in 1st whileis "+i);
                if(i<0)
                    break;
            }
            int j=i+1;
            while(Character.isAlphabetic(arr[j]))
            {
                s+=arr[j];
                j++;
                //System.out.println("Value of j in 2nd whileis "+j);
                if(j>=str.length())
                    break;
            }
            if(i>=0)
            {
                s+=arr[i];
                i--;
            }
        }
        System.out.println(s);
    }
}
