import java.util.*;
public class j54
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) 
    {
        int count=0;
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            if(i%2==1)
            {
                count=(i-1)*n;
            }
            else
            {
                count=i*n;
            }
            for(int j=1;j<=n;j++)
            {
                if(i%2==1)
                {
                    System.out.print(++count+" ");
                }
                else
                {
                    System.out.print(count--+" ");
                }
            }
            System.out.println();
        }
    }
}