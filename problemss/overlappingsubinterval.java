import java.util.*;
public class overlappingsubinterval {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = 2;
        int arr[][] = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        Arrays.sort(arr,(arr1,arr2) -> Integer.compare(arr1[0], arr2[0]));
        
    }   
}
