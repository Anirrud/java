import java.util.*;
public class j34 {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) 
    {
        System.out.print("Enter The Size Of Array = ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        int count=1;
        int max=0;
        System.out.println("Enter The Elements = ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++)
        {
            if(arr[i]<arr[i+1])
            {
                count++;
                if(count>max)
                {
                    max=count;
                }
            }
            else
            {
                count=1;
            }
        }
        System.out.print(max);
    }
}