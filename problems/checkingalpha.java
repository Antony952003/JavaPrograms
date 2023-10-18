package problems;
import java.util.*;
public class checkingalpha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        char vowel[] = {'a','e','i','o','u'};
        boolean flag = false;
        if(!(Character.isAlphabetic(c)))
        {
            System.out.println("Not Alphabet");
        }
        else{
            for(int i=0;i<vowel.length;i++)
            {
                if(c == vowel[i])
                {
                    System.out.println("Vowel");
                    flag = true;
                    break;
                }
            }
            if(!flag)
            {
                System.out.println("consonent");
            }
    
            }
        }


    }
