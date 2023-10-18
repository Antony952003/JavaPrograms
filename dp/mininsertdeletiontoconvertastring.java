package dp;
import java.util.*;
public class mininsertdeletiontoconvertastring {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        char arr1[] = str1.toCharArray();
        char arr2[] = str2.toCharArray();
        int n = arr1.length;
        int m = arr2.length;
       // int dp[][] = new int[n+1][m+1];
        int prev[] = new int[m+1];
        int cur[] = new int[m+1];
        for(int j=0;j<=m;j++){
            prev[j] = 0;
            cur[j] = 0;
        }
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=m;j++)
            {
                if(arr1[i-1] == arr2[j-1])
                    cur[j] = 1 + prev[j-1];
                else
                    cur[j] = Math.max(prev[j],cur[j-1]);
            }
            prev = cur;
        }
        System.out.println( n + m - (2 * prev[m]) );
        //to find the min insertions or deletions to be done find the 
        //longest common subsequences in the given string and then apply this operation  n + m - (2 * prev[m]) 
    }
}
