package problems;

import java.util.Scanner;

public class removeduplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int nums[] = new int[n];
        String s = "antony";
        System.out.println(s.substring(0,4));
        for(int i=0;i<n;i++)
        {
            nums[i] = sc.nextInt();
        }
        int j = 0;
        for(int i=1;i<n;i++)
        {
            if(nums[i]!=nums[j])
            {
                j++;
                nums[j] = nums[i];
            }
        }
        System.out.println("final :");
        for(int i=0;i<nums.length;i++)
        {
            System.out.print(nums[i]+" ");
        }
    }
}
