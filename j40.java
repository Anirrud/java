//input should be only 5
import java.util.*;
public class j40
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) 
    {
        System.out.print("Enter A Number : ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n*2+1;j++)
            {
                if(j<=n && i<=n/2+1)
                {
                    if(j==n-i-1||i==n/2+1||j==i+2)
                    {
                        System.out.print("* ");
                    }
                    else
                    {
                        System.out.print("  ");
                    }
                }
                if(j>n && i<=n/2+1)
                {
                    if((i==1&&j!=n+1)||j==n+(n/2)+2)
                    {
                        System.out.print("* ");
                    }
                    else
                    {
                        System.out.print("  ");
                    }
                }
                if(j<=n && i>n/2+1)
                {
                    if(j==1||j==n)
                    {
                        System.out.print("* ");
                    }
                    else
                    {
                        System.out.print("  ");
                    }
                }
                if(j>n && i>n/2+1)
                {
                    if((i==n&&j!=n+1)||j==n+(n/2)+2)
                    {
                        System.out.print("* ");
                    }
                    else
                    {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
        for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=(n*2)+1;j++)
            {
                if((i==2&&((j>=i&&j<=i+2)||(j>=n*2-2&&j<=n*2))))
                {
                    System.out.print("* ");
                }
                else if(i>=3&&i<=4&&(j==1||j==(n*2)+1))
                {
                    System.out.print("* ");
                }
                else if(i==3&&(j==n||j==n+2)||i==4&&j==n+1)
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
        for(int i=1;i<=6;i++)
        {
            for(int j=1;j<=(n*2)+1;j++)
            {
                if(j==i||j==(n*2)+2-i)
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
