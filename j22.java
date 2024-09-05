import java.util.*;
public class j22 {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) 
    {
        System.out.print("Enter Row Size = ");
        int Row=sc.nextInt();
        System.out.print("Enter Col Size = ");
        int Col=sc.nextInt();
        int arr[][]=new int[Row][Col];
        int max;
        System.out.println("Enter Your Array = ");
        for(int i=0;i<Row;i++)
        {
            for(int j=0;j<Col;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<Col;i++)
        {
            max=arr[0][i];
            for(int j=0;j<Row;j++)
            {
                if(arr[j][i]>max)
                {
                    max=arr[j][i];
                }
            }
            System.out.println("Column "+(int)(i+1)+"'s Largest Number = "+max);
        }
    }
}