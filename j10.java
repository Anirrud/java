import java.util.*;
public class j10 {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) 
    {
        System.out.print("Enter a Number = ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter Your Array = ");
        for(int i=0;i<n;i++)
        {
            arr[i]= sc.nextInt();
        }
        int sum1=0;
        int x=0;
        for(int i=0;i<n-2;i++)
        {
            sum1+=arr[i];
            int sum2=0;
            for(int j=i+2;j<n;j++)
            {    
                sum2+=arr[j];
            }
            if(sum1==sum2)
            {
                x=arr[i+1];
                break;
            }
        }
        System.out.println(x);       
    }
}

