package problems;
import java.util.*;
public class vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for(int i=0;i<n;i++)
        {
            char a = sc.next().charAt(0);
            if(a == 'a' || a == 'e' || a=='i' || a=='o' || a=='u' || a == 'A' || a == 'E' || a=='I' || a=='O' || a=='U')
                count++;
        }
        System.out.println(n - count);

    }
}
