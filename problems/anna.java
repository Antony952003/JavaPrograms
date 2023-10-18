package problems;
import java.util.Scanner;

public class anna {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int a = sc.nextInt();
        switch(a/10)
        {
            case 10:
            {
                System.out.println("O");
                break;
            }
            case 9:
            {
                System.out.println("A");
                break;
            }
            case 8:
            {
                System.out.println("B");
                break;
            }
            case 7:
            {
                System.out.println("C");
                break;
            }
            case 6:
            {
                System.out.println("D");
                break;
            }
            case 5:
            {
                System.out.println("E");
                break;
            }
            default:
            {
                System.out.println("F");
                break;
            }
              
        }
    }
}
