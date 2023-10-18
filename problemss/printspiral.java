import java.util.Scanner;

public class printspiral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[][] = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int colst = 0;
        int rowst = 0;
        int colend = m-1;
        int rowend = n-1;
        while(rowst <= rowend && colst <= colend){
            for(int i=colst;i<=colend;i++){
                System.out.print(arr[rowst][i]+" ");
            }
            rowst++;
            for(int i=rowst;i<=rowend;i++){
                System.out.print(arr[i][colend]+" ");
            }
            colend--;
            for(int i=colend;i>=colst;i--){
                System.out.print(arr[rowend][i]+" ");
            }
            rowend--;
            for(int i=rowend;i>=rowst;i--){
                System.out.print(arr[i][colst]+" ");
            }
            colst++;
        }
    }
}
