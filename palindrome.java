import java.io.*;
import java.util.*;
class palindrome
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,rem,sum=0,temp;
        a=sc.nextInt();
        temp=a;
        while(a!=0)
        {
            rem=a%10;
            sum=(sum*10)+rem;
            a=a/10;
        }
        if(temp==sum)
        {
             System.out.println("palindrome");
        }
        else
        {
             System.out.println("not a palindrome");
        }
        
    }
}
