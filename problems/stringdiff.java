package problems;
import java.util.*;
public class stringdiff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        int i = n;
        int count = 0;
        while(i > 0)
        {
            int sumd = (i%10) + (i/10);
            int sum = i - sumd;
            if(sum>=s)
            {
                count++;
            }
            i--;
        }
        System.out.println(count);
    }
}
