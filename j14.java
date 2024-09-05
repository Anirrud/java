import java.util.*;
public class j14 {
    static Scanner sc=new Scanner(System.in); 
    public static void main(String[] args) {
        System.out.println("Enter a string : ");
        String s=sc.nextLine();      
        String result = s.replace("the ", "").replace("The ", "").replace("THE ", "");  
        System.out.println(result);
    }
}