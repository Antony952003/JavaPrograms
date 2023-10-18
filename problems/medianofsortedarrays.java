package problems;

import java.util.Scanner;

public class medianofsortedarrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        int m = sc.nextInt();
        int arr1[] = new int[n];
        for(int i=0;i<n;i++)
            arr1[i] = sc.nextInt();
            int i = 0;
            int j = 0;
            int ans[] = new int[n+m];
            int v = 0;
            while(i<n && j<m)
            {
                if(arr[i]<arr1[j]){
                    ans[v] = arr[i];
                    i++;
                }
                else{
                    ans[v] = arr1[j];
                    j++;
                }
                v++;
            }
            while(i<n){
                ans[v] = arr[i];
                v++;
                i++;
            }
            while(j<m){
                ans[v] = arr1[j];
                v++;
                j++;
            }
            if(ans.length%2!=0)
                System.out.println((double)ans[ans.length/2]);
            else
                System.out.println((double)(ans[ans.length/2]+ans[(ans.length/2)-1])/2);
    }
}
