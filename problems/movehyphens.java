package problems;
import java.util.*;
public class movehyphens {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        String str = sc.nextLine();
        char arr[] = str.toCharArray();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]=='-')
            {
                for(int j=i;j>=1;j--)
                {
                    arr[j] = arr[j-1];
                }
                arr[0] = '-';            
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]);
        }
    }
}
