import java.util.*;
public class printpascalrow {
    static int f(int r,int c){
        r = r-1;
        c = c-1;
        int res = 1;
        for(int i=0;i<c;i++){
            res = res * (r-i);
            res = res / (i+1);
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int j=1;j<=n;j++){
            int lastele = 1;
            for(int s=n-j;s>=0;s--){
                System.out.print(" ");
            }
        System.out.print(lastele+" ");
            for(int i=1;i<j;i++){
                lastele = lastele * (j-i);
                lastele = lastele / (i);
                System.out.print(lastele+" ");
            }
            int arr[] = new int[n];
            System.out.println();
        }
    }
}
