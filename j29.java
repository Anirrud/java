import java.util.*;
public class j29 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.print("Enter a number = ");
        int n = sc.nextInt();
        int count=0;
        int i,j;
        for(i=2;i<n;i++)
        {
            count=0;
            for(j=2;j<i;j++)
            {
                if(i%j==0)
                {
                    count++;
                    break;
                }
            }
            if(count==0)
            {
                System.out.println(i);
            }
        }
    }    
}

