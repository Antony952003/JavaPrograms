package problems;
import java.util.*;
public class sumnumbers {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String str = sc.nextLine();
       char arr[] = str.toCharArray();
       int sum = 0;
        for(int i=0;i<arr.length;i++)
        {
            String st = "";
            while(Character.isDigit(arr[i]))
            {
                st += arr[i];
                i++;
                if(i==arr.length)
                    break;
            }
            if(st.length()>=1)
            {
            sum += Integer.parseInt(st);
            }
        }
        System.out.println(sum);
    }
}
