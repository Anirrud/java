import java.util.*;
public class j52 
{
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) 
    {
        System.out.print("Enter A String : ");
        String s1 = sc.nextLine();
        int sum = 0;
        int value = 0;
        char c;
        for (int i = 0; i < s1.length(); i++) 
        {
            c = s1.charAt(i);
            if (c >= '0' && c <= '9') 
            {
                value = (value * 10) + (c - '0');
            } 
            else 
            {
                sum += value;  // Add accumulated value to sum
                value = 0;      // Reset value for the next number
            }
        }
        sum += value; // Add the last number to sum, if any
        System.out.print(sum);
    }
}
