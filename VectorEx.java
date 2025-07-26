import java.util.List;
import java.util.Vector;

public class VectorEx {

    public static void main(String[] args) {
    
        List <String> vtr = new Vector<>();
        vtr.add("First");
        vtr.add("second");
        vtr.add("third");
        vtr.add("Fourth");

        for(String alp : vtr)
        {
            System.out.println(alp);
        }
    }
}
