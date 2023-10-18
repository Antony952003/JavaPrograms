package problems;
import java.util.*;
public class majority {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        boolean flag = false;
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int  max = n/2;
        for(int i=0;i<n;i++)
        {
            if(map.containsKey(arr[i]))
            {
                int count  = (map.get(arr[i]))+1;
                map.put(arr[i],count);
            }
            else{
                map.put(arr[i], 1);
            }
        }
        System.out.println(map);
        for(int i=0;i<n;i++)
        {
            if(map.get(arr[i])>max)
            {
                flag =true;
                max = arr[i];
            }
        }
        if(flag)
            System.out.println(max);
        else
            System.out.println("-1");


    }

}
