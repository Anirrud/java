import java.util.*;

public class BUFFER7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of bulbs: ");
        int Bulbs_count = sc.nextInt();
        sc.close(); 

        int[] a = new int[Bulbs_count]; 

        for (int i = 1; i <= Bulbs_count; i++) {
            for (int j = i; j <= Bulbs_count; j += i) {
                a[j - 1] = 1 - a[j - 1]; 
            }
            System.out.print("End of round " + i + ": ");
            for (int k = 0; k < Bulbs_count; k++) {
                System.out.print(a[k] + " ");
            }
            System.out.println();
        }
        System.out.print("Final state of the bulbs: ");
        for (int i = 0; i < Bulbs_count; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        int countOn = 0;
        for (int i = 0; i < Bulbs_count; i++) {
            if (a[i] == 1) {
                countOn++;
            }
        }
        System.out.println("Number of bulbs that are on: " + countOn);
    }
}
