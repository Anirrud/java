import java.util.*;
public class BUFFER8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num=sc.nextInt();
        int res=isfactor(num);   
        System.out.println(res);    
    }
    public static int isfactor(int num)
    {
        int sum=0;
        for(int i=2;i<=num;i++)
        {
            if(num%i==0)
            {
                if(isprime(i)==true)
                {
                    sum=sum+i;
                }
            }
        }
        return sum;
    }
    public static boolean isprime(int num) {
        for(int i=2;i<=num/2;i++)
        {
            if(num%i==0)
                return false; 
            
        }
        return true;
    }       
}


