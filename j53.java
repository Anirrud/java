import java.util.*;
public class j53 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        HashMap<String,Integer> map = new HashMap<>();
        
        map.put(sc.nextLine(),sc.nextInt());
        System.out.print(map.get("a"));
        map.put("a",map.get("a")+1);
        System.out.print(map.get("a"));
        
    }
}