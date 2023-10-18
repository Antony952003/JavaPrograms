import java.util.*;
public class max1sinrow {
    static int bin(int arr[][],int row,int m){
        int left = 0;
        int right = m-1;
        if(arr[row][left] == 1) return m;
        if(arr[row][right] == 0) return 0;
        while(left <= right){
            int mid = (left + right)/2;
            if(arr[row][mid] == 0){
                left = mid + 1;
            }
            else if(arr[row][mid] == 1 && arr[row][mid-1] == 0) return m - mid;
            else{
                right = mid - 1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[][] = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int max = 0;
        for(int i=0;i<n;i++){
            max = Math.max(max, bin(arr, i, m));
        }
        System.out.println(max);
    }
}
