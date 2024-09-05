import java.util.*;
public class j56
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) 
    {
        int count;
        int max=0;
        int row=0;
        int n=sc.nextInt();
        int[][] arr= new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++)
        {
                count=0;
            for(int j=0;j<n;j++)
            {
                if(arr[i][j]==1)
                {
                    ++count;
                }
            }
            if(count>max)
            {
                max=count;
                row=i+1;
            }
        }
        System.out.print("max row : "+row);
    }
}