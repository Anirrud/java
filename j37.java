import java.util.*;
public class j37 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter A Number : ");
        int a= sc.nextInt();
        int n1=0;
        int n2=1;
        int n3=0;
        if(a==1)
        {
            System.out.print(n1);
        }
        else if(a==2)
        {
            System.out.print(n2);
        }
        else if(a>2)
        {
            for(int i=0;i<a-2;i++)
            {
                n3=n1+n2;
                n1=n2;
                n2=n3;
            }
            System.out.print(n3);
        }
        else
        {
            System.out.print("INVALID INPUT");
        }
    }
}