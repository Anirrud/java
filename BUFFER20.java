import java.util.*;
public class BUFFER20{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter A Number = ");
        int n=sc.nextInt();
        int i,j,k;
        for(i=0;i<n;i++)
        {
            for(j=0;j<2*n-1;j++)
            {
                if(i+j==n-1 ||j-i==n-1||i==n-1)
                {

                    System.out.print("* ");
                }
                else
                System.out.print("  ");
            }
            System.out.println();            
            }
        }
    }
