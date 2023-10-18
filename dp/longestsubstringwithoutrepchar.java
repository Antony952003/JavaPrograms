package dp;
import java.util.*;
public class longestsubstringwithoutrepchar {
/*     static int f(int i,char arr[],int n,ArrayList<Character> ar)
    {
        int take = 0;
        int nottake = 0;
        if(!(ar.contains(arr[i])))
        {
            int j = i;
        while(!(ar.contains(arr[j])) && j+1<n)
        {
            ar.add(arr[j]);
            take++;
        }
        return take;
    }
        nottake = f(i+1, arr, nottake, ar);
       
        ar.
        return 1;
    } */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char arr[] = str.toCharArray();
        int n = arr.length;
        ArrayList<Character> ar = new ArrayList<>();
        int max = 0;
        for(int i=0;i<n;i++)
        {
            int count = 0;
            ar = new ArrayList<>();
            int j = i;
            while(j<n && !(ar.contains(arr[j])))
            {
                ar.add(arr[j]);
                j++;
                count++;
            }
            max = Math.max(max, count);
        }
        System.out.println(max);

    }
}
