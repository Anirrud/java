import java.util.*;

public class j51 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter A Number : ");
        int n = sc.nextInt();
        int num;
        int even = 1, odd = 1;
        for (int i = 1; i <= n; i++) {
            num = n;
            for (int j = 1; j <= n; j++) {
                if (j == num + 1 - i) {
                    if (i % 2 == 0) {
                        System.out.printf("%-4d",even * 2);
                        even++;
                    } else {
                        System.out.printf("%-4d",odd * 2 - 1);
                        odd++;
                    }
                    num++;
                } else {
                    System.out.print("    ");
                }
            }
            System.out.println();
        }
    }
}
