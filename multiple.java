import java.io.*;
import java.util.*;
class multip
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a[][]={{1,2},{5,3}};
        int b[][]={{2,3},{4,1}};
        int c[][]={{0,0},{0,0}};
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                for(int k=0;k<2;k++)
                {
                    c[i][j]+=a[i][k]*b[k][j];
                }
            }
        }
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}
