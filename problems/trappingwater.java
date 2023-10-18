package problems;
import java.util.*;
public class trappingwater {
    public static void printarr(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int maxleft[] = new int[n];
        int maxright[] = new int[n];
        int maxl = 0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>maxl && i>0)
            {
                maxl = arr[i];
                maxleft[i] = maxl;
            }
            else if(i==0)
            {
                maxleft[i] = maxl;
                maxl = arr[i];
            }
            else{
                maxleft[i] = maxl;
            }
        }
        int maxr = 0;
        for(int i=n-1;i>=0;i--)
        {
            if(arr[i] > maxr)
            {
                maxr = arr[i];
                maxright[i] = maxr; 
            }
            else{
                maxright[i] = maxr;
            }
        }
        System.out.println();
        System.out.println("Max left values :");
        printarr(maxleft);
        System.out.println();
        System.out.println("Max right values :");
        printarr(maxright);
        int sum = 0;
        for(int i=0;i<n;i++)
        {
            int value = Math.min(maxleft[i], maxright[i]) - arr[i];
            if(value >= 0)
            {
                sum += value;
            }
        }
        System.out.println();
        System.out.println(sum);
        
    }
}
