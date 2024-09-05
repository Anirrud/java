import java.util.*;
public class BUFFER13 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter A rows = ");
        int r=sc.nextInt();
        System.out.print("Enter A column = ");
        int c=sc.nextInt();
        int arr[][]=new int[r][r];
        int i,j,k,l;
        for(i=1;i<=r;i++)
        {
            for(j=r;j>i;j--)
            {
                System.out.print("  ");
            }
            for(k=1;k<=i*2-1;k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
