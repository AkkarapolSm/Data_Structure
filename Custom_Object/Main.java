package Custom_Object;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    
    public static void main(String[] args) {
        // demo();
        // demoCustomObject();
        // demoTreeSet();
        demoTreeSet2();
    }

    public static void demoTreeSet(){ 
        Set<String> set = new TreeSet<>();
        set.add("mango");
        set.add("coconut");
        set.add("apple");
        set.add("kivi");
        System.out.println(set);
    }

    
    public static void demoTreeSet2(){ 
        // Set<Drink> set = new TreeSet<>();
        // Set<Drink> set = new TreeSet<>(new Comparator<Drink>() {
        //     @Override
        //     public int compare(Drink o1, Drink o2) {
        //         return o1.getMenu().compareToIgnoreCase(o2.getMenu());
        //     }
        // });

        Comparator<Drink> cmp = new Comparator<Drink>() {
            @Override
             public int compare(Drink o1, Drink o2) {
                return o1.getMenu().compareToIgnoreCase(o2.getMenu());
            }
        };

        // Set<Drink> set = new TreeSet<>(cmp);
        Set<Drink> set = new TreeSet<>(cmp); //Drink.byNameDescending() or 
                                             //Drink.byPriceName()
        set.add(new Drink("mango", 60f));
        set.add(new Drink("coconut", 45f));
        set.add(new Drink("apple", 50f));
        set.add(new Drink("kivi", 55f));
        set.add(new Drink("orange", 70f));

        for(Drink drink : set) {
            System.out.println(drink);
        }
    }

    public static void demo() {
        Set<String> set = new HashSet<>();

        set.add("mango");
        set.add("orange");
        set.add("apple");

        System.out.println("before " + set);
        
        String s = "apple";
        if(set.contains(s)) {
            System.out.printf("%s is in the Set\n", s);
            set.remove(s);
        }else {
            System.out.printf("%s is not in the Set\n", s);
            
        }
        System.out.println("after " + set);

    }
    
    public static void demoCustomObject() {

        Set<Drink> set = new LinkedHashSet<>();

        set.add(new Drink("mango", 40f));
        set.add(new Drink("orange", 50f));
        set.add(new Drink("apple", 60f));
        set.add(new Drink("Mango", 49f));

        for(Drink drink : set) {
            System.out.printf("%s -> %s%n", drink.getMenu(),drink.getMenu().hashCode());
        }
        System.out.println();
        

        Drink d = new Drink("apple", 60f);
        if(set.contains(d)) {
            System.out.printf("%s is in the set%n", d);
        }else{
            System.out.printf("%s is not in the set%n", d);
            
        }
        System.out.println();


        set.remove(d);
        for(Drink drink : set) {
            System.out.printf("%s%n", drink);
        }
    }
}
