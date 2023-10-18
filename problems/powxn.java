package problems;
import java.util.*;
public class powxn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int dum = n;
        if(n<0) dum = -1*n;
        double ans = 1.0;
        while(dum>0)
        {
            if(dum % 2 == 0)
            {
                x = x*x;
                dum = dum /2;
            }
            else{
                ans = ans * x;
                dum = dum - 1;
            }
        }
        if(n<0)
            ans = (double)(1.0)/(double)ans;
        System.out.println(ans);

    }
}
