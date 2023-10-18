package problems;
import java.util.Scanner;

public class crc {
    public static void calc(int data[],String messagebits,int divisor[])
    {
    for(int i=0;i<messagebits.length();i++)
    {
     if(data[i]==1)
         for(int j=0;j<divisor.length;j++)
         {
             data[i+j] = data[i+j] ^ divisor[j];
         }
    }
 }
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the message bits :");
        String messagebits = sc.nextLine();
        System.out.println("enter the generator bits :");
        String generator = sc.nextLine();
        int data[] = new int[messagebits.length() + generator.length() - 1];
        int divisor[] = new int[generator.length()];
        for(int i=0;i<messagebits.length();i++)
        {
            data[i] = Integer.parseInt(messagebits.charAt(i)+"");
        }
        for(int i=0;i<generator.length();i++)
        {
            divisor[i] = Integer.parseInt(generator.charAt(i)+"");
        }
       //calculation of crc
      calc(data,messagebits,divisor);
       //display the crc
       System.out.println("The checksum code :");
       for(int i=0;i<messagebits.length();i++)
       {
        data[i] = Integer.parseInt(messagebits.charAt(i)+"");
       }
       for(int i=0;i<data.length;i++)
       {
        System.out.print(data[i]);
       }
       System.out.println();
       //checking
       System.out.println("Enter the checksum code :");
       messagebits = sc.nextLine();
       System.out.println("Enter the generator bits :");
       generator = sc.nextLine();
       data = new int[messagebits.length() + generator.length() - 1];
       divisor = new int[generator.length()];
       for(int i=0;i<messagebits.length();i++)
       {
        data[i] = Integer.parseInt(messagebits.charAt(i)+"");
       }
       for(int i=0;i<generator.length();i++)
       {
        divisor[i] = Integer.parseInt(generator.charAt(i)+"");
       }
       //calculate
       calc(data,messagebits,divisor);

       boolean valid = true;
       for(int i=0;i<data.length;i++)
       {
        if(data[i]==1)
        {
            valid = false;
            break;
        }
       }

       if(valid==true)
       {
        System.out.println("NO ERRORS FOUND");
       }
       else{
        System.out.println("error found");
       }

    }
}
