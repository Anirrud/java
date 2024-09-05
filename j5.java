import java.util.*;
public class j5 {
    static Scanner sc =new Scanner(System.in);
    public static void main(String[] args) 
    {
        System.out.print("Enter a string");
        String str=sc.nextLine();
        int count=0;
        int i;
        int x=str.length();
        for(i=0;i<x/2;i++)
        {
            if(str.charAt(i)==str.charAt(x-i-1))
            {
                count++;
            }
        }
        for(i=count;i<x-count;i++)
        {
            System.out.print(str.charAt(i));
        }    
    }
}