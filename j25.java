import java.util.*;
public class j25 
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) 
    {
        System.out.print("Enter a Number = ");
        int m=sc.nextInt();
        System.out.print("Enter a Number = ");
        int n=sc.nextInt();
        int arr[][]=new int[m][n];
        int arr1[]=new int[m*n];
        int l=0;
        int count=1;
        System.out.println("Enter Your Array = ");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        int size;
        if(m>n)
        {
            size=m;
        }
        else
        {
            size=n;
        }
        if(m==1 || n==1)
        {
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                {
                    arr1[l++]=arr[i][j];
                }
            }
        }
        else
        {
            for(int k=0;k<size*2-1;k++)
            {
                for(int i=0;i<m;i++)
                {
                    for(int j=0;j<n;j++)
                    {
                        if(i+j==k)
                        {
                            if(k%2==0)
                            {
                                arr1[l++]=arr[j][i];   
                            }
                            else
                            {
                                arr1[l++]=arr[i][j];
                            }
                        }
                    }
                }
            }
        }
        for(int i=0;i<arr1.length;i++)
        {
            System.out.print(arr1[i]+" ");
        }
    }
}
