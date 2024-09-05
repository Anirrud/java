import java.util.*;
public class BUFFER17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter A Number = ");
        int n=sc.nextInt();
        int i,j,k;
        for(i=0;i<n;i++)
        {
            for(j=0;j<n-i;j++)
            {
                System.out.print(n-j);
            }
            System.out.println();
        }
    }
}
