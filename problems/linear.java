package problems;
import java.util.*;
public class linear {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        int f = sc.nextInt();
        for(int i = 0;i<n;i++)
        {
            if(f==a[i])
            {
                System.out.println(f+" is present at location "+(i+1));
                break;
            }
        }
    }
}
