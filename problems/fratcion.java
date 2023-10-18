package problems;
import java.util.Scanner;

public class fratcion {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String a= sc.nextLine();
        String b= sc.nextLine();
        
        int length_str;
        if(a.length()<b.length()){
             length_str=a.length();
        }
        else{
             length_str=b.length();
        }
        int flag=1;
        int aptr=a.length()-1;
        int bptr=b.length()-1;
        for(int  i=length_str-1;a.charAt(i)=='/' ;i--){
            if(a.charAt(aptr)!=b.charAt(bptr)){
                flag=0;
                break;
            }
            aptr--;
            bptr--;
        }
    if(flag==1){
        System.out.println("yes");
    }
    else
    System.out.println("no");
    }

}
