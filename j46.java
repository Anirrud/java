import java.util.*;
public class j46
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args)
    {
        System.err.print("Enter A Number : ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i+1;j++)
            {
                for(int k=1;k<=i*2-1;k++)
                {
                    System.out.print(i);
                }
                System.out.println();
            }
        }
    }
}