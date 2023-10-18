package problems;
import java.util.*;
public class frequencychar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char c[] = str.toCharArray();
        int i,j;        //abcdaabcaba
        int x=0;
        int max = 1;


            for(i=0;i<c.length-1;i++)
            {
                int count = 1;
                for(j =i+1;j<c.length;j++)
                {
                    if(c[i] == c[j])
                    {
                        count++;
                    }
                }
                if(count>max)
                {
                    max = count;
                }
            }
            System.out.println(max);
    }
    
}
