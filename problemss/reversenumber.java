import java.util.Scanner;

public class reversenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int com = n;
        int val  = 0;
        int res = 0;
        
        while(n > 0) {
            val = n%10;
            res = (res * 10) + val;
            n = n/10;
    }
    System.out.println(res);
    if(res == com)
        System.out.println("Its is a palidrome");
   
}
}
