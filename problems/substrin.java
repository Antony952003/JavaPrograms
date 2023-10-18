package problems;
public class substrin {
     static int f(int ind1,int ind2,char arr1[],char arr2[],int n,int m)
    {
        if(ind2 > m-1){
            return ind1-(m-1);
        }
        if(ind1 > n-1)
            return -1;
        if(arr1[ind1] == arr2[ind2])
            return f(ind1+1, ind2+1, arr1, arr2, n, m);
        else
            return f(ind1+1, ind2, arr1, arr2, n, m);
        
    } 
    public static void main(String[]args)
    {
        String a = "antonyjeson";
        String b ="son";
        int str = a.length();
        int sub = b.length();
        char arr1[] = a.toCharArray();
        char arr2[] = b.toCharArray();
        int n = arr1.length;
        int m = arr2.length;
        int ans = f(0, 0, arr1, arr2, n, m);
        if(ans>=0)
            System.out.println("found at "+ans);
        else{
            System.out.println("Not found");
        }
        /*  boolean flag = false;
        for(int i=0;i<=str-sub;i++)
        {
            
            if((a.substring(i,sub+i)).equals(b))
            {
                System.out.println("Found at "+(i+1));
                flag = true;
                break;
            }
        }
        if(!flag)
        {
            System.out.println("Not found");
        } 
 */
    }
    
}
