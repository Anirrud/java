import java.util.*;
public class j48
{
    static Scanner sc= new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.print("Enter A number : ");
        int n = sc.nextInt();
        int arr[][]=new int[n][n];
        int startRow=0,startCol=0,endRow=n-1,endCol=n-1;
        int num=0;
        while(startRow<=endRow && startCol<=endCol)
        {
            for(int i=startCol;i<=endCol;i++)
            {
                arr[startRow][i]=++num;
            }
            startRow++;
            for(int i=startRow;i<=endRow;i++)
            {
                arr[i][endCol]=++num;
            }
            endCol--;
            for(int i=endCol;i>=startCol;i--)
            {
                arr[endRow][i]=++num;
            }
            endRow--;
            for(int i=endRow;i>=startRow;i--)
            {
                arr[i][startCol]=++num;
            }
            startCol++;
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}