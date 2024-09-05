import java.util.Scanner;
public class j33 
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.print("Enter The Size Of Array : ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        int sum;
        int max=arr[0]*arr[1];
        System.out.println("Enter The Elements Of Array : ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++)
        {
            sum=arr[i]*arr[i+1];
            if(sum>max)
            {
                max=sum;
            }
        }
        System.out.print(max);
    }
}
