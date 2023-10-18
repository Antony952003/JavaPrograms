package problems;

import java.util.Scanner;

public class maxnoofwords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str =sc.nextLine();
        String broken = sc.next();
        String arr[] = str.split(" ");
        int count  = 0;
        for(int i=0;i<arr.length;i++)
        {
            int flag = 1;
            for(int j=0;j<broken.length();j++)
            {
                if(arr[i].contains(broken.charAt(j)+"")){
                    flag = 0;
                }
            }
            count += flag;
        }
        System.out.println(count);
    }
}
