package dp;
import java.util.*;
public class longestsstringchain {
    static boolean isvalid(String a,String b)
    {
        int n = a.length();
        int m = b.length();
        if(n != m+1)
            return false;
        int i = 0;
        int j = 0;
        while(i < n){
            if(j<m && a.charAt(i)==b.charAt(j))
            {
                i++;
                j++;
            }
            else{
                i++;
            }
        }
        if(j == m && i==n)
            return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String arr[] = new String[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.next();
        }
        int dp[] = new int[n];
        int hash[] = new int[n];
        Arrays.fill(dp, 1);
        Arrays.sort(arr, Comparator.comparing(s->s.length()));
        int max = 1;
        int last = 0;
        for(int i=0;i<n;i++)
        {
            hash[i] = i;
            for(int j=0;j<i;j++)
            {
                if(isvalid(arr[i],arr[j]) == true && 1 + dp[j] > dp[i])
                {
                    dp[i] = 1 + dp[j];
                    hash[i] = j;
                }
            }
            if(dp[i] > max)
            {
                max = dp[i];
                last = i;
            }
        }
        System.out.println(max);
        ArrayList<String> ar = new ArrayList<>();
        ar.add(arr[last]);
        while(hash[last]!=last)
        {
            last = hash[last];
            ar.add(arr[last]); 
        }
        Collections.reverse(ar);
        System.out.println(ar);

    }
}   
