import java.io.*;
import java.util.*;
class greater
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if(a>b && a>c) 
        {
            System.out.println(a+"is greater");
        }
        else if(b>c && b>a)
        {
            System.out.println(b+"is greater");
        }
        else
        {
            System.out.println(c+"is greater");
        }
    }
}
 
