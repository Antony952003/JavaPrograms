package problems;

import java.util.Scanner;

public class removedigittomaximize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number = sc.nextLine();
        char digit = sc.next().charAt(0);
        int j = 0;
        int max = 0;
        for(int i=0;i<number.length();i++)
        {
            String str = "";
            if(number.charAt(i) == digit)
            {
                j = 0;
                while(j < number.length())
                {
                    if(j!=i){
                        str += number.charAt(j);
                    }
                    j++;
                } 
            }
            if(str.length()>=1)
                max = Math.max(max, Integer.parseInt(str));
        }
        String s = "";
        s += max;
        System.out.println(s);
    }
}
