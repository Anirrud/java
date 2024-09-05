import java.util.*;
public class BUFFER2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A Number = ");
        int num=sc.nextInt();
        int sq_num=(int)Math.pow(num,2);
        int temp=sq_num,count=0;
        while(temp>0)
        {
            temp=temp/10;
            count=count+1;
        }
            int size1=count/2;
            int size2=count-size1;

        int size4=(int)Math.pow(10,size2);
        int firstPart2 = sq_num / size4;
        int secondPart2 = sq_num - firstPart2 * size4;
        int total2=firstPart2+secondPart2;
        if( total2==num)
        {
            System.out.println("Its Kaprekar number");
        }
        else
        {
            System.out.println("Its not A Kaprekar number");
        }

}
}