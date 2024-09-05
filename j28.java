import java.util.*; 
public class j28 {
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
        for (int i=0;i<product.size();i++)
        {
            for(int j=i+1;j<product.size();j++)
            {
                if(product.get(i)==product.get(j))
                {
                    product.remove(j);
                    j--;
                }
            }
        }
        for (int i=0 ; i<product.size() ; i++)
        {
            System.out.print(product.get(i)+" ");
        }
    }
}