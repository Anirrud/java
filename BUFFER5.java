import java.util.*;
public class BUFFER5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter A Number = ");
        int num1=sc.nextInt();
        int count=0;
        while(num1>0)
        {
            if((num1&1)==1)
            {
                count=count+1;
            }
            num1=num1>>1;
        }
        System.out.print(count);
    }
}
