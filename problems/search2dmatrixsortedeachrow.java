package problems;
import java.util.*;

public class search2dmatrixsortedeachrow {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
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
        int findval = sc.nextInt();
        int i = 0;
        int j = (n*m) -1;
        int mid = 0;
        while(i<=j)
        {
            mid = (i+j)/2;
            if(arr[mid/m][mid%m] == findval)
            {
                System.out.println("Found at position ("+mid/m+","+mid%m+")");
                break;
            }
            if(arr[mid/m][mid%m] < findval)
            {
                i = mid+1;
            }
            else{
                j = mid-1;
            }
        }
    }
}
