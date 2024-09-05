import java.util.*;
public class j42 
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) 
    {
        System.out.print("Enter A string : ");
        String s=sc.nextLine().toLowerCase();
        int a[]=new int[26];
        int flag=0;
        for(int i=0;i<s.length();i++)
        {
            char c= s.charAt(i);
            if ( 'a'<=c || 'z'>=c)
            {
                a[c-'a']++;
            }
        }
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==0)
            {
                flag=1;
                break;
            }
        }
        if(flag==1)
        {
            System.out.print("Not An Anagram");
        }
        else
        {
            System.out.println("Anagram");
        }
    }
}
