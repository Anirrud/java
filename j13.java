import java.util.*;
public class j13 {
    static Scanner sc=new Scanner(System.in); 
    public static void main(String[] args) {
        System.out.println("Enter a string : ");
        String s=sc.nextLine();
        String result = s.replaceAll("[aeiouAEIOU]", "");
        System.out.println(result);
    }
}