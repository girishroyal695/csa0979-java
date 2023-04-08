import java.io.*;
import java.util.*;
class mmm
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size");
        int s=sc.nextInt();
        int a[]=new int[s];
        for(int i=0;i<s;i++)
        {
            a[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<s;i++)
        {
            sum=sum+a[i];
        }
        float avg=sum/s;
        System.out.print("mean="+avg+" ");
        int temp=0;
        for(int i=0;i<s;i++)
        {
            for(int j=i+1;j<s;j++)
            {
                if(a[i]>a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        if(s%2!=0)
        {
            System.out.println("median="+a[s/2]);
        }
        else
        {
            System.out.println("median="+((a[s/2]+a[s+1/2])/2));
        }
        int maxcount=0;
        int maxvalue=0;
        for(int i=0;i<s;i++)
        {
            for(int j=i+1;j<s;j++)
            {
                if(a[i]==a[j])
                {
                    maxcount++;
                    maxvalue=a[i];
                }
            }
        }
        System.out.println("mode="+maxvalue);

    } 
}
