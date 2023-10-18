package problems;

import java.util.Scanner;

public class griduniquepaths {
    static boolean isafe(int i,int j,int n)
    {
        if(i>=n || j>=n)
            return false;
        return true;
    }
    static int f(int i,int j,int n,int arr[][])
    {
        int count  = 0;
        if(i == n-1 && j == n-1)
            return 1;
        if(isafe(i, j+1, n))
        {
           count += f(i, j+1, n, arr);
        }
        if(isafe(i+1, j, n))
        {
            count += f(i+1, j, n, arr);
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int gri[][] = new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                gri[i][j] = 1;
            }
        }
        System.out.println(f(0,0,n,gri));
    }
}
