package problems;
import java.util.*;
public class movezeros {
    public static void sort(char arr[])
    {
        int size = arr.length;
        for(int i = 0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                if(arr[j]<arr[i])
                {
                    char temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i]+"");
        }
        System.out.println();
    }
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {
            String s = sc.nextLine();
            char arr[] = s.toCharArray();
            sort(arr);
            t--;
        }
    }
}
