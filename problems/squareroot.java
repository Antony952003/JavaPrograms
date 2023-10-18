package problems;

import java.util.Scanner;

public class squareroot {
    static int f(int n)
    {
        int x = 0;
        while(x*x<=n)
        {
            x++;
        }
        return x-1;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(f(n));
    }
}
