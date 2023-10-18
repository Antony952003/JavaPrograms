package dp;

public class frogjump {
    static int f(int index,int arr[],int dp[])
    {
        if(index==0)
            return 0;
        if(dp[index]!=-1)
            return dp[index];
        int left = f(index-1,arr,dp) + Math.abs(arr[index] - arr[index-1]);
        int right = 999999;
        if(index>1)
            right = f(index-2,arr,dp) + Math.abs(arr[index] - arr[index-2]);
        return dp[index] = Math.min(left, right);
    }
    public static void main(String[] args) {
        int arr[] = {30,10,60,10,60,50};
        int dp[] =  new int[arr.length];
        for(int i =0;i<dp.length;i++)
        {
            dp[i] = -1;
        }
        int n = arr.length-1;
        int left=0,right = 0;
        int count = f(n,arr,dp);
        System.out.println(count);
        for(int i =0;i<dp.length;i++)
        {
            System.out.print(dp[i]);
        }


    }
}
