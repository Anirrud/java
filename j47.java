import java.util.*;
public class j47
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) 
    {
        System.out.print("Enter A Number : ");
        int n=sc.nextInt();
        int size=n*2-1;
        int num=n;
        int arr[][]=new int[size][size];
        int startRow=0,startCol=0,endRow=size-1,endCol=size-1;
        while(startRow<=endRow&&startCol<=endCol)
        {
            for(int i=startCol;i<=endCol;i++)
            {
                arr[startRow][i]=num;
            }
            for(int i=startRow;i<=endRow;i++)
            {
                arr[i][startCol]=num;
            }
            for(int i=endCol;i>=startCol;i--)
            {
                arr[endRow][i]=num;
            }
            for(int i=endRow;i>=startRow;i--)
            {
                arr[i][endCol]=num;
            }
            startRow++;
            startCol++;
            endCol--;
            endRow--;
            num--;
        }
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}