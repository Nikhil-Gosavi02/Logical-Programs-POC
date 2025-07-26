
import java.util.*;

public class EvenOdd {
    
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  Number for check it Even or Odd");

        int num = sc.nextInt();

        if(num % 2 == 0)
        {
            System.out.println(num+ "Its is Even");
        }
        else
        {
            System.out.println(num+ "Its Odd number");
        }
    }
}
