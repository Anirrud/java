import java.util.*;
public class j20 
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        int[] arr=new int[62];
        System.out.print("Enter A String = ");
        char[] s=sc.nextLine().toCharArray();
        int count;
        for(int i=0;i<s.length;i++)
        {
            if(Character.isLowerCase(s[i]))
            {
                arr[s[i]-'a']++;
            }
            if(Character.isUpperCase(s[i]))
            {
                arr[s[i]-'A'+26]++;
            }
            if(Character.isDigit(s[i]))
            {
                arr[s[i]-'0'+52]++;
            }
        }
        for(int i=0;i<62;i++)
        {
            if(arr[i]>1)
            {
                count=arr[i]-1;
                arr[i]-=count;
                if(i<26)
                {
                    arr[(i+1)%26]+=count;
                }
                if(i>=26 && i<52)
                {
                    arr[((i+1)%26)]+=count;
                }
                if(i>=52 && i<62)
                {
                    arr[(i+1)%52]+=count;
                }
            }
        }
        for(int i=0;i<62;i++)
        {
            if(arr[i]==1)
            {
                if(i<26)
                {
                    System.out.print((char)('a'+i));
                }
                if(i>=26 && i<52)
                {
                    System.out.print((char)('A'+(i-26)));
                }
                if(i>=52 && i<62)
                {
                    System.out.print((char)('0'+(i-52)));
                }
            }
        }
    } 
}