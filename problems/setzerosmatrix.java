package problems;

import java.util.Scanner;

public class setzerosmatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(arr[i][j] == 0)
                {
                    int row = i;
                    int col = 0;
                    while(col<n)
                    {
                        if(arr[row][col]!=0)
                            arr[row][col] = -1;
                        col++;
                    }
                    row = 0;
                    col = j;
                    while(row<n)
                    {
                        if(arr[row][col]!=0)
                            arr[row][col] = -1;
                        row++;
                    }
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(arr[i][j] == -1)
                    arr[i][j] = 0;
            }
        }
        //print
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
