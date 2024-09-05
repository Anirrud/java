import java.util.*; 
public class j26 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter A String = ");
        String s1=sc.nextLine();
        char arr[]=new char[s1.length()];
        char temp;
        int i,j;
        for(i=0;i<s1.length();i++)
        {
            arr[i]=s1.charAt(i);
        }
        i=0;
        j=arr.length-1;
        while(i<=j)
        {
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        for(i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]);
        }
    }
}