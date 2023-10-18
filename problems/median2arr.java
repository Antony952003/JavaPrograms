package problems;
import java.util.*;
public class median2arr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int arr1[] = new int[n1];
        for(int i=0;i<n1;i++)
        {
            arr1[i] = sc.nextInt();
        }
        int n2 = sc.nextInt();
        int arr2[] = new int[n2];
        for(int i=0;i<n2;i++)
        {
            arr2[i] = sc.nextInt();
        }
        int i,j,k;
        i=j=k=0;
        int arr[] = new int[n1+n2];
        while(i < arr1.length && j < arr2.length)
        {
            if(arr1[i]<arr2[j])
            {
                arr[k] = arr1[i];
                i++;
            }
            else{
                arr[k] = arr2[j];
                j++;   
            }
            k++;
        }
        while(i < arr1.length)
        {
            arr[k] = arr1[i];
            i++;
            k++;
        }
        while(j < arr2.length)
        {
            arr[k] = arr2[j];
            j++;
            k++;
        }
        for(int x=0;x<arr.length;x++)
        {
            System.out.print(arr[x]+" ");
        }
        System.out.println();
        System.out.println("Median of the sorted merged array is:");
        if(arr.length%2==0)
        {
            System.out.print(" "+arr.length/2);
        }
        else{
            System.out.print(" "+(arr.length+1)/2);
        }
        




    }
}
