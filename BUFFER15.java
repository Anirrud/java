import java.util.*;
public class BUFFER15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter A Number = ");
        int n=sc.nextInt();
        int i,j,k;
        for(i=0;i<n;i++)
        {
            for(j=0;j<i;j++)
            {
                System.out.print("  ");
            }
            for(k=0;k<n*2-(i*2)-1;k++)
            {
                if(k==0||k==(n*2)-(i*2)-2||i==0)
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