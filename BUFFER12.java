import java.util.*;
public class BUFFER12 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the max range = ");
        int num=sc.nextInt();
        int arr[]=new int[num+1];
        int i,j;
        for(i=0;i<num+1;i++)
        {
            if(i==0 || i==1)
            {
                arr[i]=0;
            }
            else
            {
                arr[i]=1;
            }
        }
        for ( i = 2; i <= Math.sqrt(num); i++)
        {
            if (arr[i] == 1)
            {
                for (j = i*i; j <= num; j += i)
                {
                    arr[j]=0;
                }
            }
        }
        for(i=0;i<num+1;i++)
        {
            if(arr[i]==1)
            {
                System.out.print(i+" ");
            }
        }
    }
}