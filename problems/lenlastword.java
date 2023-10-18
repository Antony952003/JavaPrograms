package problems;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class lenlastword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        int rowstart = 0;
        int rowend = n-1;
        int colstart = 0;
        int colend = n-1;
        int val = 1;
    while(rowstart <= rowend)
    {
        for(int i=colstart;i<=colend;i++)
        {
            arr[rowstart][i] = val;
            val++;
        }
        rowstart++;
        for(int i=rowstart;i<=rowend;i++)
        {
            arr[i][colend] = val;
            val++;
        }
        colend--;
        for(int i=colend;i>=colstart;i--)
        {
            arr[rowend][i] = val;
            val++;
        }
        rowend--;
        for(int i=rowend;i>=rowstart;i--)
        {
            arr[i][colstart] = val;
            val++;
        }
        colstart++;
    }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }
        


    }
}
