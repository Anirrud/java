import java.util.*;
public class BUFFER9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number = ");
        int num=sc.nextInt();
        int[][] a = new int[num][num];
        int i,j;
        for(i=0;i<num;i++)
        {
            for(j=0;j<=i;j++)
            {   
                if(i==0 && j==0)
                    a[0][0]=1;
                if(i==1 && j==0)
                    a[1][0]=1;   
                if(i>0 && j==0)
                {
                    a[i][0]=a[i-1][i-1];
                }
                if(i>0 && j>0)
                {
                    a[i][j]=a[i][j-1]+a[i-1][j-1];
                }
            }
        }
        for(i=0;i<num;i++)
        {
            for(j=0;j<=i;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
