import java.util.*;
public class j21 {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) 
    {
        System.out.print("Enter a Number = ");
        int n=sc.nextInt();
        int arr[][]=new int[n][n];
        int min;
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
            min=arr[i][0];
            for(int j=1;j<n;j++)
            {
                if(arr[i][j]<min)
                {
                    min=arr[i][j];
                }
            }
            System.out.println("Row "+(int)(i+1)+"'s Smallest Number = "+min);
        }
    }
}