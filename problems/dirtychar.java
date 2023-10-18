package problems;
import java.util.*;
public class dirtychar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char st[] = str.toCharArray();
        String rem = sc.nextLine();
        char re[] = rem.toCharArray();
        int count = 0;


        for(int i=0;i<st.length;i++)
        {
            for(int j=0;j<re.length;j++)
            {
                if(st[i] == re[j])
                {
                    count++;
                    for(int x = i;x<st.length-1;x++)
                    {
                        st[x] = st[x+1];
                    }
                }
            }
        }

        for(int i=0;i<st.length-count;i++)
        {
            System.out.print(st[i]);
        }
    }
}
