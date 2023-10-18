package problems;

import java.util.Scanner;

public class manachers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = str.length();
        char arr[] = new char[(2*n)+1];
        int k = 0;
        for(int i=0;i<(2*n)+1;i++)
        {
            if(i % 2 == 0)
            {
                arr[i] = '#';
            }
            else{
                arr[i] = str.charAt(k);
                k++;
            }
        }
        for(int b=0;b<arr.length;b++)
        {
            System.out.print(arr[b]+" ");
        }
        int first = 0;
        int last = 0;
        int mid=0,i=0,j = 0;
        int count  = 0;
        int max = 0;
        String ans = "";
        while(mid < arr.length){
            i=mid;
            j=mid;
            first = i;
            last = j;
            count  = 0;
            if(arr[i] == '#')
            {
                i = i - 1;
                j = j + 1;
            }
            else{
                i = i - 2;
                j = j + 2;
                count++;
            }
            if(i>=0 && j<arr.length)
            {
                while(arr[i]==arr[j])
                {
                    i = i - 2;
                    j = j + 2;
                    count += 2;
                    if(i<0 || j>=arr.length)
                    {
                        i = i + 2;
                        j = j - 2;
                        first = i;
                        last = j;
                        break;
                    }
                }
                if(arr[i]!=arr[j])
                {
                    first = i + 2;
                    last = j - 2;
                }
            }
            if(count > max){
                max = count;
                ans = "";
            for(int v = first;v<=last;v+=2)
            {
                ans += arr[v];
            }
        }
            mid++;
        }
        System.out.println(ans);
        System.out.println(max);
        
 }

}
