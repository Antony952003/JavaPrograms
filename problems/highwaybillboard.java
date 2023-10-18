package problems;
import java.util.*;
public class highwaybillboard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int miles = sc.nextInt();
        int n = sc.nextInt();
        int sites[] = new int[n];
        int revenue[] = new int[n];
        for(int i=0;i<n;i++)
        {
            sites[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            revenue[i] = sc.nextInt();
        }
        int t = sc.nextInt();
        int soln[] = new int[sites.length];
        for(int i=0;i<sites.length;i++)
        {
            soln[i] = revenue[i]; 
        }
        int j = 0;
        int i = 1;
        while(i<sites.length)
        {
            System.out.println("i value :"+i);
            if((sites[i]-sites[j]) > t)
            {
                System.out.println("value of j "+j);
                int sum = soln[j] + revenue[i];
                soln[i] = Math.max(sum, soln[i]);
                System.out.println("soln value at i = "+i+" and j = "+j+" is "+soln[i]);
                j++;
                if(j>=i)
                {
                    j=0;
                    i++;
                }
            }
            else
            {
                j++;
                if(j>=i)
                {
                    j=0;
                    i++;
                }
            }
        }
        for(int x=0;x<soln.length;x++)
        {
            System.out.print(soln[x]+" ");
        }
        int max = 0;
        System.out.println();
        for(int x=0;x<soln.length;x++)
        {
            max = Math.max(max,soln[x]);
        }
        System.out.println(max);
    }
}
