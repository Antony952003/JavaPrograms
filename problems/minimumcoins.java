package problems;
import java.util.*;
public class minimumcoins {
    public static void main(String[] args) {
        int coins[] ={1 , 2 , 5 , 10 , 20 , 50 , 100 , 500 , 1000};
        ArrayList <Integer>sum = new ArrayList<>(); 
        int n = coins.length;
        Scanner sc = new Scanner(System.in);
        int am = sc.nextInt();
        for(int i=n-1;i>=0;i--)
        {
            while(am>=coins[i])
            {
                sum.add(coins[i]);
                am-=coins[i];
            }
        }
        for(int i=0;i<sum.size();i++)
        {
            System.out.print(sum.get(i)+" ");
        }
        System.out.println(sum.size());
    }
}
