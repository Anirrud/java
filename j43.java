import java.util.*;
public class j43 {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.print("Enter The Array Size : ");
        int n=sc.nextInt();
        int a[]=new int[n];
        int count_arr[]=new int[n];
        int count=2;
        System.out.print("Enter All The Elements :");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        
        for(int i=0;i<n;i++)
        {
            count=2;
            for(int j=2;j<(a[i]/2)+1;j++)
            {
                if(a[i]%j==0)
                {
                    count++;
                }
            }
            count_arr[i]=count;
        }
        for(int i=0;i<n;i++)
        {
            int temp;
            for(int j=i;j<n;j++)
            {
                if(count_arr[i]<count_arr[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
                if(count_arr[i]==count_arr[j])
                {
                    
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
