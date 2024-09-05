import java.util.*;
public class j44 
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.print("Enter A number :");
        int n= sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print((char)('A'+j-1));
            }
            System.out.println();
        }
    }
}