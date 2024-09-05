import java.util.*;
public class j50 
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) 
    {
        System.out.print("Enter A Number : ");
        int n=sc.nextInt();
        int num;
        int count;
        for(int i=1;i<=n;i++)
        {
            count=i;
            num=n;
            for(int j=1;j<=n;j++)
            {
                if(j==num+1-i)
                {
                    System.out.printf("%-3d",count--);
                    num++;
                }
                else
                {
                    System.out.printf("   ");
                }
            }
            System.out.println();
        }
    }
}
