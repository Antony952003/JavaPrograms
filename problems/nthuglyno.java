package problems;

import java.util.ArrayList;
import java.util.Scanner;

public class nthuglyno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        ArrayList<Integer> ar = new ArrayList<>();
        int n1 = 1;
        while(true)
        {
            int no = n1;
            while(no%2 == 0) no=no/2;
            if(ar.contains(no)) no=1;
            while(no%3 == 0) no=no/3;
            if(ar.contains(no)) no=1;
            while(no%5 == 0) no=no/5;
            if(no == 1){
                count++;
                ar.add(n1);
                System.out.print(n1+" ");
            }
            if(count == n){
                break;
            }
            n1++;    
        }
    }
}
