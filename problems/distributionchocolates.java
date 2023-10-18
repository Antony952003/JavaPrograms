package problems;
import java.util.*;
public class distributionchocolates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int m = sc.nextInt();
        int j,max,min,count;
        int minval = 99999;
        for(int i=0;i<=arr.length-m;i++)
        {
            j=i;
            max=0;
            min=9999;
            count = 0;
            while(count<m)
            {
                if(count==0)
                {
                    min = arr[j];
                }
                if(count==m-1)
                {
                    max = arr[j];
                }
                j++;
                count++;

            }
            int value = (max - min);
            if(value<minval)
                minval = value; 
        }
        System.out.println("The minimum value is "+minval);


    }   
}
