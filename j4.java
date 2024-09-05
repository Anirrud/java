import java.util.*;

public class j4 {
    static Scanner sc = new Scanner(System.in); 
    public static void common(int[] arr1,int[] arr2,int n1,int n2)
    {
        int i=0,j=0;
        while(i<n1 && j<n2)
            {
                if(arr1[j]>arr2[i])
                {
                    i++;
                }
                else if(arr1[j]<arr2[i])
                {
                    j++;
                }
                else
                {   
                    System.out.println(arr1[i]);
                    i++;
                    j++;
                }
            }

    }
    public static int[] remove_duplicate(int[] arr,int n)
    {
        for(int i=0;i<n-1;i++)
        {
            if(arr[i]==arr[i+1])
            {
                
            }
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
          
        System.out.print("Enter Size of Array1 = ");
        int n1=sc.nextInt();
        System.out.print("Enter Size of Array2 = ");
        int n2=sc.nextInt();
        int[] arr1=new int[n1];
        int[] arr2=new int[n2];
        read_input(arr1, n1);
        read_input(arr2, n2);
        sort(arr1, n1);
        sort(arr2, n2);
        common(arr1, arr2, n1, n2);
    }    
}
