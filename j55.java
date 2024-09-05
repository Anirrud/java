import java.util.*;
public class j55 
{
    static Scanner sc=new Scanner(System.in);
    public static int min_sol(int[] arr,int arr_Size,int target)
    {
        int count=0;
        for(int i=arr_Size-1;i>=0;i--)
        {
            while(target>=arr[i])
            {
                target-=arr[i];
                ++count;
            }
            if(target==0)
            {
                break;
            }
        }
        return count;
    }
    public static void main(String[] args) 
    {
        int arr_Size=sc.nextInt();
        int[] arr=new int[arr_Size];
        int x=0;
        for(int i=0;i<arr_Size;i++)
        {
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        Arrays.sort(arr);
        x=min_sol(arr,arr_Size,target);
        System.out.print(x);
    }
}