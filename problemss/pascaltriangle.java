import java.util.*;
public class pascaltriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        r = r-1;
        c = c-1;
    //4c3 => 3c2  3*2/1*2
        int res = 1;
        for(int i=0;i<c;i++){
            res = res * (r-i);
            res = res / (i+1);
        }
        System.out.println(res);
    }
}
