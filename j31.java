import java.util.*;
public class j31 
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) 
    {
        System.out.println("Enter Size Of Array = ");
        int n=sc.nextInt();
        int[] arr= new int[n];
        int count=0;
        int i;
        for(i=0;i<n;i++)
        {
               arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        i=0;
        while(i<n-1)
        {
            if(arr[i]==arr[i+1])
            {
                count++;
            }
            else
            {
                count=0;
            }
            if(count==0)
            {
                System.out.println("NON DUPE:"+arr[i]);
            }
            if(count==1)
            {
                System.out.println("DUPE:"+arr[i]);
            }
            i++;
        }
    }
}
