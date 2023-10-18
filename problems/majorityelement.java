package problems;

import java.util.Scanner;

public class majorityelement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int ele = 0;
        int l = 0;
        for(int i=0;i<n;i++)
        {
            if(l == 0){
                ele = arr[i];
                l = 1;
            }
            else if(arr[i] == ele)
            {
                l++;
            }
            else{
                l--;
            }
        }
        n = n/2;
        l = 0;
        for(int i=0;i<n;i++)
        {
            if(ele == arr[i])
            {
                l++;
            }
        }
        if(l > n)
        {
            System.out.println(ele+" is the majority element");
        }
        else{
            System.out.println("No Majority element found");
        }

    }   
}
