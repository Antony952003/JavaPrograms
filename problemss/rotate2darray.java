import java.util.*;
public class rotate2darray {
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
        //traspose 
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;

                System.out.println(arr[i][j]+"   "+ arr[j][i]);
            }
        }
        System.out.println();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        
        s1.substring(, n)
        //reverse the array
        for(int i=0;i<m;i++){
            int x = 0;
            int y = n-1;
            while(x < y){
                int temp = arr[x][i];
                arr[x][i] = arr[y][i];
                arr[y][i] = temp;
                x++;
                y--;
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
