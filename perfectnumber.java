import java.io.*;
import java.util.*;
class perfectnumber
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                sum+=i;
            }
        }
        if(sum==n)
        {
            System.out.print(n+" is a perfect number");
        }
        else
        System.out.println(n+" not a perfect number");
    }
}
