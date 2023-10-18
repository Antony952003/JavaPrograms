package problems;
import java.util.*;
public class validateip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ip = sc.nextLine();
        char arr[] = ip.toCharArray();
        int j;
        int count = 0;
        for(int i=0;i<arr.length;i++)
        {
            j=i;
            String dum = "";
            while(Character.isDigit(arr[j]))
            {
                dum += arr[j];
                j++;
                if(j>=arr.length)
                    break;
            }
            int x = Integer.parseInt(dum);
            if(x>=0 && x<=255)
            {
                if(!(count==4))
                    count++;
            }
            if(j<arr.length)
                i = j;
        }
        if(count==4)
            System.out.println("1");
        else
            System.out.println("0");
    }
}
