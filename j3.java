import java.util.*;

public class j3 {
    static Scanner sc = new Scanner(System.in); 
    public static void two_sum(int[] arr,int n,int target)
    {
        int i=0;
        int j=n-1;
        int count=0;
        while(i<n && j>=0)
        {
            if(arr[i]+arr[j]>target)
            {
                j--;
            }
            else if(arr[i]+arr[j]<target)
            {
                i++;
            }
            else
            {
                System.out.println(arr[i]+"+"+arr[j]+"="+target);
                count+=1;
                i++;
                j--;
            }
        }
        if(count==0)
        {
            System.out.print("Its not possible");
        }
        
    }
    public static int[] sort(int[] arr,int n)
    {
        int temp;
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]>arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }   
            }
        }
        return arr;
    }
    public static int[] read_input(int[] arr,int n)
    {
        System.out.println("Enter "+n+" number : ");
        
        for(int i =0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        return arr;
    }
    public static void main(String[] args)
    {
          
        System.out.print("Enter A Number = ");
        int n=sc.nextInt();
        System.out.print("Enter A Target = ");
        int target=sc.nextInt();
        int[] arr=new int[n];
        read_input(arr, n);
        sort(arr, n);
        two_sum(arr, n, target);
    }    
}

