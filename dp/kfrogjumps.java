package dp;

public class kfrogjumps {
    static int f(int index,int arr[],int dp[],int k)
    {
        if(index==0)
            return 0;
        int minsteps = 99999;
        for(int i=1;i<=k;i++)
        {
            if(index-i>=0){
            int left =  f(index-i,arr,dp,k) + Math.abs(arr[index] - arr[index-i]);
            minsteps = Math.min(minsteps, left);
            }
        }
        return minsteps;
        }
    
    public static void main(String[] args) {
        int arr[] = {30,10,60,10,60,50};
        int dp[]  = {-1,-1,-1,-1,-1,-1};
        int k = 5;
        int n = arr.length;
        System.out.println(f(n-1,arr,dp,k));
        
    }
}
