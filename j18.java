import java.util.*;
public class j18 {
    static Scanner sc=new Scanner(System.in); 
    public static void main(String[] args) {
        System.out.println("Enter a string1 : ");
        String s1=sc.nextLine();
        System.out.println("Enter a string2 : ");
        String s2=sc.nextLine();
        int i=0;
        int flag=0;
        if(s1.length()!=s2.length())
        {
            System.out.println("It is not a match");
        }
        else
        {
            for(i=0;i<s1.length();i++)
            {
                if(s1.charAt(i)!='?'||s2.charAt(i)!='?')
                {
                    if(s1.charAt(i)!=s2.charAt(i))
                    {
                        flag=1;
                        break;
                    }
                }
            }
        }
        if(flag==0)
        {
            System.out.println("It is a match");
        }
        else
        {
            System.out.println("It is a match");
        }
    }
}