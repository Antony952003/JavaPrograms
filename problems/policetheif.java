package problems;
import java.util.*;
public class policetheif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char arr[] = new char[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.next().charAt(0);
        }
        int k = sc.nextInt();
        
        ArrayList <Integer>th = new ArrayList<>();
        ArrayList <Integer>pol = new ArrayList<>();

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]=='P')
            {
                pol.add(i);
            }
            else{
                th.add(i);
            }
        }

        int st_th = 0;
        int st_pol = 0;
        int ans = 0;

        while(st_th < th.size() && st_pol < pol.size())
        {
            if(Math.abs(th.get(st_th)-(pol.get(st_pol)))<=k)
            {
                st_th++;
                st_pol++;
                ans++;
            }
            else if(th.get(st_th) < pol.get(st_pol))
            {
                st_th++;
            }
            else{
                st_pol++;
            }
        }
        System.out.println("Maximum thieves caught: "+ans);


    }
}
