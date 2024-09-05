import java.util.*;
public class BUFFER18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter A Number = ");
        int n=sc.nextInt();
        int i,j,k;
        for(i=0;i<n;i++){
            for(j=0;j<n;j++)
            {
                if(i==j || i+j==n-1 || i==0 || i==n-1)
                {
                    if(i<=n/2)
                    {
                        System.out.print(j+1+" ");
                    }
                    else
                    {
                        System.out.print(n-j+" ");
                    }
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