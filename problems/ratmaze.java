package problems;
import java.util.*;
public class ratmaze {
    public static boolean issafe(int arr[][],int i,int j,int r,int c)
    {
        if(i>=r || j>=c)
        {
            return false;
        }
        if(arr[i][j]== 0)
        {
            return false;
        }
        else{
            return true;
        }
    }
    public static int rat(int arr[][],int i,int j,int r,int c)
    {
        int count = 0;
         if(arr[0][0]== 0)
        {
            return 0;
        } 
        if(i>=r || j>=c)
        {
            return 0;
        }
        if(i == r-1 && j == c-1)
        {
            return 1;
        }
        if(issafe(arr,i,j+1,r,c))
        {
            count += rat(arr, i, j+1, r, c);
        }
        if(issafe(arr,i+1,j,r,c))
        {
            count += rat(arr, i+1, j, r, c);
        }
        return count;  
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int arr[][] = new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        int count = rat(arr, 0, 0, r, c);
        System.out.println(count);


        
    }
}