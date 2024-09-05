import java.util.*;
public class j9 {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) 
    {
        System.out.print("Enter a Number = ");
        int n=sc.nextInt();
        int arr1[]=new int[n];
        int arr2[]=new int[n];
        System.out.println("Enter Your Array = ");
        int m=0;
        for(int i=0;i<n;i++)
        {
            arr1[i]= sc.nextInt();
        }
        for(int i=0;i<n-1;i++)
        {
            int count=0;
            for(int j=i+1;j<n;j++)
            {
                if(arr1[i]>arr1[j])
                {
                    count++;
                }
                if(n-i-1==count)
                {
                    arr2[m++]=arr1[i];
                }
            }
        }
        arr2[m++]=arr1[n-1];
        for(int i=0;i<m;i++)
            {
                System.out.print(arr2[i]+" ");
            }
    }
}
