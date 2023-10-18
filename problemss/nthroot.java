import java.util.*;

import javax.lang.model.util.ElementScanner14;
public class nthroot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long r = sc.nextInt();
        long l = 1;
        long h = n/r;
        long ans = 0;
        while(l <= h){
            long m = (l+h)/2;
            double val = Math.pow((double)m, (double)r);
            if((long)val == n){
                System.out.println(m);
                break;
            }
            else if((long)val < n){
                ans = m;
                l = m + 1;
            }
            else 
                h = m - 1;  
        }
        System.out.println(ans);

    }
}
