import java.util.*;
public class j16 {
    static Scanner sc=new Scanner(System.in); 
    public static void main(String[] args) {
        System.out.println("Enter a string : ");
        String s=sc.nextLine();
        int count=0;
        int max=0;
        for(int i=0;i<s.length();i++)
        {
            if(count>max)
            {
                max=count;
            }
            if(s.charAt(i)==' ')
            {
                count=0;
            }
            else
            {
                count++;
            }
        }
        System.out.print(max);
    }
}