import java.util.*;
public class j39{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n=sc.nextInt();
        System.out.print("Enter Window size : ");
        int size=sc.nextInt();
        int arr[]=new int[n];
        int sum=0;
        int max=0;
        System.out.println("enter the elements:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++)
        {
            max=max+arr[i];
        }
        for(int i=0;i<n-size+1;i++)
        {
            sum=0;
            for(int j=0;j<size;j++)
            {
                sum=sum+arr[i+j];
                if(sum>max)
                {
                    max=sum;
                }
            }
        }
        System.out.println("MAX = "+max);
    }
}