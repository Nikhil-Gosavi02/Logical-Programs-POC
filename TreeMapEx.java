import java.util.TreeMap;

public class TreeMapEx {
    
    public static void main(String[] args) {
        
        TreeMap <Integer, String> tm = new TreeMap<>();
     
        tm.put(1, "Nikhil");
        tm.put(2, "Haresh");
        tm.put(1, "Rahul");
        tm.put(4, "Haresh");

        for(Integer key:tm.keySet())
        {
            System.out.println(key + "=> "+tm.get(key));
        }
    }
}
