import java.util.*;
public class j12 {
    static Scanner sc=new Scanner(System.in); 
    public static void main(String[] args) {
        System.out.println("Enter a string : ");
        String s=sc.nextLine();
        int i=0;
        int j=s.length()-1;
        int count=0;
        while(i<j)
        {
            if(i < j && Character.isLetterOrDigit(s.charAt(j))==false)
            {
                i++;
            }
            if(i < j && Character.isLetterOrDigit(s.charAt(j))==false)
            {
                j--;
            }
            if(s.charAt(i)==s.charAt(j))
            {
                i++;
                j--;
            }
            else
            {
                count+=1;
            }
        }
        if(count==0)
        {
            System.out.println("Its A Palindrome");
        }
        else
        {
            System.out.println("Its Not A Palindrome");
        }
    }
}
