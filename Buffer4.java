import java.util.*; 
public class Buffer4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter A String = ");
        String s1=sc.nextLine();
        String lower_s1=s1.toLowerCase();
        int[] count=new int[26];
        for(int i=0;i<lower_s1.length();i++)
        {
            char currentChar=lower_s1.charAt(i);
            if(currentChar>='a' && currentChar<='z')
            {
                count[currentChar-'a']++;
            }
        }
        for(int i=0;i<26;i++)
        {
            if(count[i]>0)
            {
                char letter=(char) ('a'+i);
                System.out.println(letter+"="+count[i]);
            }
        }

    }
}