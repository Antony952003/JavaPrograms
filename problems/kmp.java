package problems;
import java.util.Scanner;

public class kmp {
             void KMPSearch(String pat, String txt)
            {
                int M = pat.length();
                int N = txt.length();
         

                int lps[] = new int[M];

         

                computeLPSArray(pat, M, lps);
                int j = 0; 
                int i = 0; 
                while(i < N)
                {
                    if(pat.charAt(j)==txt.charAt(i))
                    {
                        i++;
                        j++;
                    }
                    else{
                        if(j==0)
                        {
                            i++;
                        }
                        else
                        {
                            j = lps[j-1];
                        }
                    }
                    if(j == pat.length())
                    {
                        System.out.println("The pattern is found at "+((i-M)+1));
                        break;
                    }
                }
            }
         
            void computeLPSArray(String pat, int M, int lps[])
            {
                int len = 0;
                int i = 1;
                lps[0] = 0; 
         
                while (i < M) {
                    if (pat.charAt(i) == pat.charAt(len)) {
                        len++;
                        
                        lps[i] = len;
                        i++;
                    }
                    else 
                    {
                        if (len != 0) {
                            len = lps[len - 1];
                        }
                        else 
                        {
                            lps[i] = len;
                            i++;
                        }
                    }
                }
            }
            public static void main(String args[])
            {
                String txt = "antony";
                String pat = "tony";
                kmp p = new kmp();
                p.KMPSearch(pat, txt);
            }
        }