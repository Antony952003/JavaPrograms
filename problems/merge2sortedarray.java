package problems;

import java.util.Arrays;
import java.util.Scanner;

public class merge2sortedarray {
    static void swap(int i,int j,int nums1[],int nums2[])
    {
        int temp = nums1[i];
        nums1[i] = nums2[j];
        nums2[j] = temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nums1[] = {1,2,3,0,0,0};
        int m = 3;
        int nums2[] = {2,5,6};
        int n = 3;
        int i = 0;
        int j = 0;
        while(i<m && j<n)
        {
            if(nums1[i] > nums2[j])
            {
                swap(i,j,nums1,nums2);
                Arrays.sort(nums2);
            }
            else{
                i++;
            }
        }
        int c = 0;
        for(int x = m;x<nums1.length;x++)
        {
            nums1[x] = nums2[c];
            c++;
        }
        for(int x=0;x<nums1.length;x++)
        {
            System.out.print(nums1[x]+" ");
        }
        System.out.println();
        for(int x=0;x<nums2.length;x++)
        {
            System.out.print(nums2[x]+" ");
        }
    }
}
