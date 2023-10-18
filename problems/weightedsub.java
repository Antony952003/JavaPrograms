package problems;
import java.util.*;
public class weightedsub {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char a[] = new char[27];
        int v[] = new int[27];
        int summ[] = new int[27];
        int i=0;
        for(char x='a';x<='z';x++)
        {
            a[i] = x;
            i++;
        }
        int y=0;
        for(int j=1;j<=27;j++)
        {
            v[y] = j;
            y++;
        }
        for(int h=0;h<v.length;h++)
        {
            int summa = 0;
            if(h==0)
            {
                summ[h] = v[h];
            }
            else{
                summa += (v[h]*summ[h-1])+summ[h-1];
                summ[h] = summa;
            }
        }
        int sum = 0; 
        for(int k=0;k<str.length();k++)
        {
            for(y=0;y<a.length;y++)
            {
                if(Character.toLowerCase(str.charAt(k)) == a[y])
                {
                    if(a[y]=='a')
                    {
                        sum += summ[y];
                    }
                    else{
                    sum += summ[y];
                    }
                }
            }
        }
        System.out.println();
        System.out.println(sum);


    }   
}
