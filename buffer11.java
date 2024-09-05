    import java.util.*;

    public class buffer11 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A Character From VIBGYOR: ");
        String input = sc.nextLine();
        String lower_input = input.toLowerCase();

        String violet = "\u001B[38;5;93m"; 
        String indigo = "\u001B[38;5;75m";  
        String blue = "\u001B[34m";  
        String green = "\u001B[32m"; 
        String yellow = "\u001B[33m"; 
        String orange = "\u001B[38;5;208m"; 
        String red = "\u001B[31m";    
        String reset = "\u001B[0m";

        if (lower_input.equals("v")) {
            System.out.println(violet + "Violet" + reset);
        } else if (lower_input.equals("i")) {
            System.out.println(indigo + "Indigo" + reset);
        } else if (lower_input.equals("b")) {
            System.out.println(blue + "Blue" + reset);
        } else if (lower_input.equals("g")) {
            System.out.println(green + "Green" + reset);
        } else if (lower_input.equals("y")) {
            System.out.println(yellow + "Yellow" + reset);
        } else if (lower_input.equals("o")) {
            System.out.println(orange + "Orange" + reset);
        } else if (lower_input.equals("r")) {
            System.out.println(red + "Red" + reset);
        } else {
            System.out.println("Enter a Letter From VIBGYOR");
        }

        sc.close();
    }
}
