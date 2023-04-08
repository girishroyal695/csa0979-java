import java.io.*;
import java.util.*;
class composite
{          
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[10];
        int n;
        System.out.println("enter the size");
        n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int comp=0;
        for(int i=0;i<n;i++)
        {
            int count=0;
            for(int j=1;j<=a[i];j++)
            {
                if(a[i]%j==0)
                {
                    count+=1;
                }
            }
            if(count>2)
            {
                comp+=1;
            }
        }
        System.out.println(comp);
    }
}
