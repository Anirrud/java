import java.util.*;
public class j1 
{
    public static void sort(int[] arr,int n)
    {
        int i,j,temp;
        for(i=0;i<n;i++)
        {
            for(j=i;j<n;j++)
            {
                if(arr[i]>arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("Sorted Array");
        for(i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }
   public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        j1 jj=new j1();
        System.out.print("Enter A Number = ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.err.println("Enter "+n+" Elemets : ");
        for (int i = 0; i < n; i++) 
        {
            arr[i]=sc.nextInt();
        }
        sort(arr,n);        
}
}

    