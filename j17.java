import java.util.*;
public class j17 {
    static Scanner sc=new Scanner(System.in); 
    public static void main(String[] args) {
        System.out.println("Enter a string1 : ");
        String s1=sc.nextLine();
        System.out.println("Enter a string2 : ");
        String s2=sc.nextLine();
        int i,size1,size2;
        int len1=(s1.length()<s2.length())?s1.length():s2.length();
        for(i=0;i<len1;i++)
        {
            System.err.print(s1.charAt(i));
            System.err.print(s2.charAt(i));
        }
        int len2 = i;
        if(s1.length()<s2.length())
        {
            for(i=len2;i<s2.length();i++)
            {
                System.err.print(s2.charAt(i));
            }
        }
        if(s1.length()>s2.length())
        {
            for(i=len2;i<s1.length();i++)
            {
                System.err.print(s1.charAt(i));
            }
        }
    }
}