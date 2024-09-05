import java.util.*;
public class j45 
{
    static Scanner sc=new Scanner(System.in);
    public static boolean isPrime(int n)
    {
        int count=2;
        for(int i=2;i<n/2+1;i++)
        {
            if(n%i==0)
            {
                count++;
            }
        }
        if(count==2)
        {
            return true;
        }
        return false;
    }
    public static int reverse(int n) 
    {
        int rem=0;
        int rev=0;
        while(n>0)
        {
            rem=n%10;
            rev=(rev*10)+rem;
            n=n/10;
        }  
        return rev;  
    }
    public static void main(String[] args)
    {
        System.out.print("Enter A number :");
        int n= sc.nextInt();
        int rev_n=reverse(n);
        if(isPrime(n)==true && isPrime(rev_n)==true)
        {
            System.out.print("Its Twisted Prime");
        }
        else
        {
            System.out.print("Its not Twisted Prime");
        }
    }
}