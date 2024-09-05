import java.util.*; 
public class j6 {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.print("Enter a Number = ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter Your Array = ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Smallest Number in Array = "+arr[0]);
        System.out.println("Largest Number in Array = "+arr[n-1]);
    }    
}