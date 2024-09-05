import java.util.*; 
public class j27 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        LinkedList<Integer> product = new LinkedList<>();
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) 
        {
            product.add(sc.nextInt());
        }
        int max=product.getFirst();
        for (int i=0 ; i<n ; i++)
        {
            if(product.get(i)>max)
            {
                max=product.get(i);
            }
        }
        System.out.print(max);
    }
}