import java.util.*;
public class buffer3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A Number = ");
        int num=sc.nextInt();
        int num1=num-1;
        int count=0;
        for(int i=0;i<10;i++)
        {
            int num2=(int)Math.pow(2,i);
            int num3=(int)Math.pow(2,num2);
            if(num1==num3)
            {
                count=count+1;
                break;
            }
        }
        if(count==1)
        {
            System.out.println(num+" is Fermat Prime Number");
        }
        else
        {
            System.out.println(num+" is not a Fermat Prime Number");
        }
    }
}
