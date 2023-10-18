package problems;

import java.util.Scanner;

public class rotateimageormatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<m;j++)
            {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        System.out.println();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        int i = 0;
        int j = m-1;
        for(int x=0;x<n;x++)
        {
            i=0;
            j=m-1;
        while(i<=j)
        {
            int temp = arr[x][j];
            arr[x][j] = arr[x][i];
            arr[x][i] = temp;
            i++;
            j--;
        }
    }
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
