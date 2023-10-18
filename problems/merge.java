package problems;
import java.util.*;
public class merge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = (n+m);
        int arr[] = new int[x];
        for(int v=0;v<n;v++)
        {
            arr[v] = sc.nextInt();
        }
        int arr1[] =  new int[m];
        for(int v=0;v<m;v++)
        {
            arr1[v] = sc.nextInt();
        }
        for(int j=0;j<m;j++)
        {
            for(int i=0;i<n;i++)
            {
                if(arr1[j]<arr[i])
                {
                    int temp =arr[i];
                    arr[i] = arr1[j];
                    arr1[j] = temp;
                }
            }
        }
        Arrays.sort(arr1);
        int i=n;
        for(int j=0;j<m;j++)
        {
            arr[i] = arr1[j];
            i++;
        }
        for(i =0;i<x;i++)
        {
            System.out.print(arr[i]+" ");
        }




        



        

    }
   


}
