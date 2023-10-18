package dp;
import java.util.*;
public class maximumnonadjascentsubsequences {
    static int f(int index,int arr[], int dp[] )
    {
        int pick = 0,notpick=0;
        if(index==0)
        {
            return arr[index];
        }
        if(index<0)
            return 0;
        if(dp[index]!=-1){
            return dp[index];}
        pick = arr[index] + f(index-2, arr, dp);
        notpick = f(index-1, arr, dp);
        return dp[index] = Math.max(pick, notpick);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {5,5,10,100,10,5};
        int dp[] = {-1,-1,-1,-1,-1,-1};
        int n = arr.length-1;
        System.out.println(f(n,arr,dp));
    }
}
