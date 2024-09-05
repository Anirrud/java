import java.util.*;
public class j23 {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) 
    {
        System.out.print("Enter a Number = ");
        int n=sc.nextInt();
        int arr[][]=new int[n][n];
        int diag_sum1=0;
        int diag_sum2=0;
        int row_sum;
        int col_sum;
        int flag=0;
        System.out.println("Enter Your Array = ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==j)
                {
                    diag_sum1+=arr[i][j];
                }
                if(i+j==n-1)
                {
                    diag_sum2+=arr[i][j];
                }
            }
        }
        if(diag_sum1!=diag_sum2)
        {
            flag=1;
        }
        if(flag==0)
        {
            for(int i=0;i<n;i++)
            {
                row_sum=0;
                col_sum=0;
                for(int j=0;j<n;j++)
                {
                    row_sum+=arr[i][j];
                    col_sum+=arr[j][i];
                }
                if(diag_sum1!=row_sum  || diag_sum1!=col_sum)
                {
                    flag=1;
                    break;
                }
            }
        }
        if(flag==1)
        {
            System.out.print("Its Not A Magic Cube");
        }
        else
        {
            System.out.print("Its A Magic Cube");
        }
    }
}