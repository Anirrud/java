import java.util.*;

public class BUFFER6 {
    public static void main(String[] args) {
        int num = 197;
        int num1 = num;
        List<Integer> rem = new ArrayList<>();
        while (num > 0) {
            rem.add(0, num % 10);  
            num = num / 10;
        }

        int size = rem.size();
        int sum = 0;
        while (sum < num1) {
            sum = 0;
            for (int i = rem.size() - size; i < rem.size(); i++) {
                sum += rem.get(i);
            }
            rem.add(sum);
        }
        for (int i = 0; i < rem.size(); i++) {
            System.out.print(rem.get(i) + " ");
        }
        System.out.println();

        if (sum == num1) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
