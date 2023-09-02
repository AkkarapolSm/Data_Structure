import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;


public class People {
    private static Map<Std, User> people2 = new LinkedHashMap<>();
    
public static void main(String[] args) {
    createMap();
    System.out.println(".....................");
    createMap2();
}

public static void createMap() {
        Map<String, Integer> people = new HashMap<String, Integer>();
        
        people.put("akkarapol",  20);
        people.put("Padet    ",  20);
        people.put("Surangkul",  19);
        people.put("Sathapana",  19);
        people.put("Kavin    ",  20);
        
        
        // for (String i : name.keySet()) {
        //     System.out.println("key: " + i + " value: " + name.get(i));
        //   }
        for (Map.Entry<String, Integer> e :people.entrySet())
            System.out.println("Key: " + e.getKey() + " Value: " + e.getValue());

        people.clear();
        System.out.println(people);
    
    }

public static void createMap2() {
    

        people2.put(new Std("Akkarapol", "20"), new User("AKK", "123456789"));
        people2.put(new Std("Akkarapol", "20"), new User("AKK", "123456789"));
        people2.put(new Std("Akkarapol", "20"), new User("AKK", "123456789"));
        
        
        
        
        
        
        // for (String i : name.keySet()) {
        //     System.out.println("key: " + i + " value: " + name.get(i));
        //   }
        for (Entry<Std, User> e :people2.entrySet())
            System.out.println("Key: " + e.getKey() + " Value: " + e.getValue());

        people2.clear();
        System.out.println(people2);

}



}

