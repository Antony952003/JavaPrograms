package problems;
import java.util.*;
public class nqueens {
    static int n;
    public static void printmatrix(char[][] matrix)
    {
        System.out.print("[ ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(matrix[i][j] == 'Q')
                    System.out.print((j+1)+" ");
            }
        }
        System.out.print("]");
        System.out.println();


    }
    public static boolean isSafe(char[][] matrix,int r,int c)
    {
        //vertical
        for(int i=0;i<n;i++)
            if(matrix[i][c]=='Q')
                return false;

        //horizontal
        for(int j=0;j<n;j++)
            if(matrix[r][j]=='Q')
                return false;

        //left upper diagonal
        for(int i=r,j=c;i>=0 && j>=0;i--,j--)
            if(matrix[i][j]=='Q')
                return false;

        //right upper diagonal
        for(int i=r,j=c;i>=0 && j<n;i--,j++)
            if(matrix[i][j]=='Q')
                return false;

        return true;   
    }
    public static void nqueenssolution(char[][] matrix,int r)
    {
        if(r==n)
        {
            printmatrix(matrix);
        }
        else{
        for(int c=0;c<n;c++)
        {
            if(isSafe(matrix,r,c))
            {
                matrix[r][c] = 'Q';
                nqueenssolution(matrix, r+1);
                matrix[r][c] = '-';
            }
        }
    }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        char [][]matrix = new char[n][n];
        for(int i=0;i<n;i++)
        {
           for(int j=0;j<n;j++)
           {
            matrix[i][j] = '-';
           }
        }
       // printmatrix(matrix);
        nqueenssolution(matrix,0);



    }
}
