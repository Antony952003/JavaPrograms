package dp;
public class fibo {
    static int f(int dp[],int n)
    {
        if(dp[n]==-1)
        {
        if(n<=1)
            return n;
        else{
            dp[n] = f(dp,n-1) + f(dp,n-2); 
            return dp[n];
        }
        }
    else{
        return dp[n];
    }
    }
    public static void main(String[] args) {
    int n = 5;
    int dp[] = new int[n+1];
    for(int i=0;i<n+1;i++)
    {
        if(i==0||i==1)
            dp[i] = i;
        else{
            dp[i] = -1;
        }
    }
    System.out.println(f(dp,n));
            
    }
}
