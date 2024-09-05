import java.util.*;
public class Assignment1 {
    static Scanner sc=new Scanner(System.in);
    public static void discounted_price(int cost,int x)
    {
        cost=cost-((cost/100)*x);
        System.out.println(cost);
    }
    public static void main(String[] args) 
    {
        System.out.print("Enter a Number = ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter Your Array = ");
        for(int i=0;i<n;i++)
        {
            arr[i]                                                                    = sc.nextInt();
        }
        int cost=0; 
        for(int i=0;i<n;i++)
        {
            cost+=arr[i];
        }
        System.out.println(cost);
        if(cost < 50)
        {
            discounted_price(cost,10);
        }
        else if(50<=cost && cost< 100)
        {
            discounted_price(cost,20);
        }
        else
        {
            discounted_price(cost,25);
        }
    }
}