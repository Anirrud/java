import java.util.Scanner;

public class j32 {
    public static int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        int count=0;
        int same_count=0;
        int size=n;
        if(m>n)
        {
            count=m-n;
        }
        else if(n>m)
        {
            size=m;
            count=n-m;
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(word1.charAt(i)==word2.charAt(j))
                {
                    same_count+=1;
                }
            }
        }
        count=count+size-same_count;
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first word: ");
        String word1 = scanner.nextLine();
        
        System.out.print("Enter the second word: ");
        String word2 = scanner.nextLine();
        
        int result = minDistance(word1, word2);
        System.out.println("The minimum number of operations required: " + result);
        
        scanner.close();
    }
}
