import java.util.*;
public class j15 {
    static Scanner sc=new Scanner(System.in); 
    public static void main(String[] args) {
        System.out.println("Enter a string : ");
        String s=sc.nextLine().toLowerCase(); 
        int flag=0; 
        for(char i='a';i<'z';i++)
        {
            if(s.contains(String.valueOf(i))==false)
            {
                flag=1;
                break;
            }
        }
        if(flag==1)
        {
            System.out.println("Its Not A Pangram");
        }
        else
        {
            System.out.println("Its A Pangram");
        }       
    }
}   
