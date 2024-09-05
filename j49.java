import java.util.*;
public class j49 
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) 
    {
        System.out.print("Enter A Number : ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(j+i-1==n)
                {
                    System.err.print(n);
                }
                else
                {
                    System.out.print((j+i-1)%n);
                }
            }
            System.out.println();
        }
    }
}
