package problems;

import java.util.Scanner;

public class search2dmatrixrowssorted {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[][] = new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        int findval = sc.nextInt();
        int i = 0;
        int j = m-1;
        while(i<n && j>=0)
        {
            if(arr[i][j] == findval){
                System.out.println("Found at position ("+i+","+j+")");
                break;
            }
            if(arr[i][j] < findval)
                i++;
            else
                j--;
        }
    }
}
