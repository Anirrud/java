import java.util.*;
public class j36
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int count;
        System.out.println("Enter the size:");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("enter the array elements:");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++)
        {
            count=0;
            for(int j=0;j<i;j++)
            {          
                if(arr[i]==arr[j])
                {
                    count++;
                }
            }
            if(count==1)
            {              
            System.out.print(arr[i]+" ");
            }  
        }       
    }
}