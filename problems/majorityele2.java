package problems;
import java.util.*;
public class majorityele2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int ele1 = 0;
        int cnt1 = 0;
        int ele2 = 0;
        int cnt2 = 0;
        ArrayList<Integer> ar = new ArrayList<>();
        for(int i=0;i<n;i++)
        {

            if(arr[i] == ele1)
            {
                cnt1++;
            }
            else if(arr[i] == ele2)
            {
                cnt2++;
            }
            else if(cnt1 == 0)
            {
                ele1 = arr[i];
                cnt1 = 1;
            }
            else if(cnt2 == 0)
            {
                ele2 = arr[i];
                cnt2 = 1;
            }
            else{
                cnt1--;
                cnt2--;
            }
        }
        cnt1 = 0;
        cnt2 = 0;
        for(int i=0;i<n;i++)
        {
            if(arr[i] == ele1)
                cnt1++;
            else if(arr[i] == ele2)
                cnt2++;
        }
        if(cnt1 > n/3)
            ar.add(ele1);
        if(cnt2 > n/3)
            ar.add(ele2);
        System.out.println(ar);
    }
}
