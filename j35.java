import java.util.*;
public class j35{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int count;
        System.out.println("Enter the size:");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("enter the array elements:");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++){
            count=0;
        
        for(int j=0;j<i;j++){          // if j<size then it is for printing duplicate arr
            if(arr[i]==arr[j]){
                count++;
            }
        }
        if(count==0){               // count==0 means no duplicate & count=1 means duplicate count is 1
            System.out.print(arr[i]+" ");
            
        }  
        }
         
    }
}