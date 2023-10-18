package problems;
import java.util.*;
public class ratmaze2 {
    static void f(int i,int j,int vis[][],int arr[][],String str,int n,ArrayList<String> ans )
    {
        if(i==n-1 && j==n-1)
        {
            System.out.println(str);
            ans.add(str);
            return;
        }
        //downward
        if(i+1<n && vis[i+1][j]!=1 && arr[i+1][j]==1)
        {
            vis[i][j] = 1;
            f(i+1, j, vis, arr, str +'D', n,ans);
            vis[i][j] = 0;
        }
        //leftward
        if(j-1>=0 && vis[i][j-1]!=1 && arr[i][j-1]==1)
        {
            vis[i][j] = 1;
            f(i, j-1, vis, arr, str +'L', n,ans);
            vis[i][j] = 0;
        }
        //rightward
        if(j+1<n && vis[i][j+1]!=1 && arr[i][j+1]==1)
        {
            vis[i][j] = 1;
            f(i, j+1, vis, arr, str +'R', n,ans);
            vis[i][j] = 0;
        }
        //Upward
        if(i-1>=0 && vis[i-1][j]!=1 && arr[i-1][j]==1)
        {
            vis[i][j] = 1;
            f(i-1, j, vis, arr, str +'U', n,ans);
            vis[i][j] = 0;
        }
        return;
    }
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
        String str = "";
        int vis[][] = new int[n][n];
        ArrayList<String> ans = new ArrayList<>();
        if(arr[0][0]==1)
        {
            f(0,0,vis,arr,str,n,ans);
        }
        System.out.println(ans);
        System.out.println(ans.size());
    }   
}
