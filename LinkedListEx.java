import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {

    public static void main(String[] args) 
    {
        List<Integer> lkd = new LinkedList<>();

        lkd.add(10);
        lkd.add(20);
        lkd.add(25);
        lkd.add(10);

        System.out.println(lkd);

        for(int numbers : lkd)
        {
            System.out.println(numbers);
        }
    }
}
