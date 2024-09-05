import java.util.*;
public class j8 {
    static Scanner sc=new Scanner(System.in);
    public static void swap(int[] arr,int start,int end)
    {
        int temp;
        temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
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
        System.out.print("Enter a Number = ");
        int x=sc.nextInt();
        if(n%2!=0)
        {
            x=x+1;
        }
        int y=x%n;
        for(int i=0;i<n/2;i++)
        {
            int start=i;
            int end=n-i-1;
            swap(arr,start,end);
        }
        for(int i=y;i<n;i++)
        {
            int start=i;
            int end=n-i-1;
            swap(arr,start,end);
        }
        for(int i=0;i<n;i++)
            {
                System.out.print(arr[i]+" ");
            }
    }
}
