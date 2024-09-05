import java.util.*;
public class j30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1=sc.nextLine();
        char arr[]=new char[s1.length()];
        int top=-1;
        for(int i=0;i<s1.length();i++)
        {
            if(s1.charAt(i)=='(')
            {
                push(s1.charAt(i));
            }
            else
            {
                pop();
            }
        }
        if(top==-1)
        {
            System.out.print("Balanced Paranthesis");
        }
        else
        {
            System.out.print("Not Balanced Paranthesis");
        }
    }
    public static void push(char n) {
        arr[++top]=n;
    }
    public static void pop() {
        top--;
        if(top==-1)
        {
            System.out.print("Not Balanced Paranthesis");
        }
    }
}