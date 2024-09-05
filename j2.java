import java.util.*;
public class j2 
{
    public static void pattern(int n)
    {
        int i,j;
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print((i+j)%n+1+" ");
            }
            System.out.println();
        }
    } 
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter A Number = ");
        int n=sc.nextInt();
        pattern(n);
    }    
}
