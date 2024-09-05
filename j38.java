import java.util.*;
public class j38 
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) 
    {
        System.out.print("Enter A Number : ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i+1;j++)
            {
                System.out.print("  ");
            }
            for(int j=1;j<=(i*2)-1;j++)
            {
                if(i==1||j==1||i==(i*2)-1||j==(i*2)-1)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i+1;j++)
            {
                System.out.print("  ");
            }
            for(int j=1;j<=(n-i)*2-1;j++)
            {
                if((i==1&&j==i)||j==1||(i==((n-i)*2)-1&&j==i)||j==((n-i)*2)-1)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }        
}
