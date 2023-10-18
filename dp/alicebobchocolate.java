import java.util.Scanner;

public class alicebobchocolate {
    /* static int f(int row,int col1,int col2,int arr[][],int dp[][][],int n,int m)
    {
        if(col1<0 || col1>m-1 || col2 < 0 || col2>m-1){
            return -9999;
        }
        if(row == n-1){
            if(col1==col2)
                return arr[row][col1];
            else
                return arr[row][col1]+arr[row][col2];
        }
        if(dp[row][col1][col2] != -1)
            return dp[row][col1][col2];

        int max = 0;
        for(int i=-1;i<=1;i++)
        {
            for(int j=-1;j<=1;j++)
            {
                if(col1 == col2)
                   max = Math.max(max,  arr[row][col1] + f(row+1, col1+i, col2+j, arr,dp, n , m));
                else
                max = Math.max(max, arr[row][col1] + arr[row][col2] + f(row+1, col1+i, col2+j, arr,dp, n,m));
            }
        }
        return dp[row][col1][col2] =  max;
    } */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[][] = new int[n][m];
        int dp[][][] = new int[n][m][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        /* for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                for(int k=0;k<m;k++)
                {
                    dp[i][j][k] = -1;
                }
            }
        } */

       /*  2 3 1 2
        3 4 2 2
        5 6 3 5 */
        //System.out.println(f(0,0,n-1,arr,dp,n,m));
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(i==j)
                {
                    dp[n-1][i][j] = arr[n-1][j];
                }
                else{
                    dp[n-1][i][j] = arr[n-1][i] + arr[n-1][j];
                }
                
            }
        }
        for(int i=n-2;i>=0;i--)
        {
            for(int j=0;j<m;j++)
            {
                for(int k=0;k<m;k++)
                {
                    int max = -9999;
                    for(int dj1=-1;dj1<=1;dj1++)
                    {
                        for(int dj2=-1;dj2<=1;dj2++)
                        {
                            int value = 0;
                            if(j==k)
                                value = arr[i][j];
                            else
                                value = arr[i][j] + arr[i][k];
                            if( j+dj1>=0 && j+dj1<m && k+dj2>=0 && k+dj2<m)
                            {
                                value += dp[i+1][j+dj1][k+dj2];
                            }
                            else    
                                value += -9999;
                            max = Math.max(max, value);
                        }
                    }
                    dp[i][j][k] = max;
                }
            }
        }
        System.out.println(dp[0][0][m-1]);
        
    }
}
