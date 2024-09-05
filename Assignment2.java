import java.util.*;
public class Assignment2 
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.print("Enter A String = ");
        String s=sc.nextLine();
        int space=0,upper=0,lower=0,words=0;
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c==' ')
            {
                space+=1;
            }
            else if(Character.isUpperCase(c))
            {
                upper+=1;
            }
            else
            {
                lower+=1;
            }
        }
        String[] arr= s.split(" ");
        for(String a : arr)
        {
            words+=1;
        }
        System.out.println("Number Of Space = "+space);
        System.out.println("Number Of Upper Case Letters = "+upper);
        System.out.println("Number Of Lower Case Letters = "+lower);
        System.out.println("Number Of words = "+words);
    }
}
