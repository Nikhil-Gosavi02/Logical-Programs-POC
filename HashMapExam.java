import java.util.*;

public class HashMapExam {
    
    public static void main(String[] args) {
        
        Map <Integer, String> hashm = new HashMap<>();

        hashm.put(1, "Java");
        hashm.put(2, "Python");
        hashm.put(3, "JavaScript");

        System.out.println("HashMap Printss :" +hashm.get(2));

        System.out.println("Full Map Print" +hashm);

        


    }
}
