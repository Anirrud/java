import java.util.*;
public class BUFFER16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter A Number = ");
        int n=sc.nextInt();
        int i,j,k;
        for(i=0;i<n;i++)
        {
            for(j=0;j<n-i-1;j++)
            {
                System.out.print("  ");
            }

            for(k=0;k<i*2+1;k++)
            {
                if(k==0||k==i*2||i==n-1)
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
        for(i=0;i<n;i++)
        {
            for(j=0;j<n*2;j++)
            {
                if(j==0||j==(n-1)*2)
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
