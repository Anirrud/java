import java.util.*;
public class BUFFER22 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ltr=103;
        int mil=65;
        System.out.print("Enter How Much You Paid For Petrol = ");
        double n1=sc.nextDouble();
        System.out.print("Enter A How Much Kilometer To Cover = ");
        double n2=sc.nextDouble();
        System.out.println("The Amount Of Petrol  You'll Get For The Paid Amount = "+(double)n1/ltr);
        System.out.println("The Amount Of Petrol  Required To Cover The Distance = "+(double)n2/mil);
    }
}