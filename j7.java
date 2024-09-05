import java.util.*;
public class j7 {
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
        int x=n/2;
        for(int i=0;i<n;i++)
        {
            arr[i]= sc.nextInt();
        }
        if(n%2!=0)
        {
            x=n/2+1;
        }
        for(int i=0;i<n/2;i++)
        {
            int start=i;
            int end=x+i;
            swap(arr,start,end);
        }
        if(n%2!=0)
        {
            for(int i=n/2;i<n-1;i++)
            {
                int start=i;
                int end=i+1;
                swap(arr,start,end);
            }
        }
        for(int i=0;i<n;i++)
            {
                System.out.print(arr[i]+" ");
            }
    }
}
