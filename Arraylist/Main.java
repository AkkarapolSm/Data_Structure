package Arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class Main {
    public static void main(String[] args) {
        // demoArraylist();
        // demoSimpleArraylist();
        // demoSortString();
        demoNaturalOrderSort();
    }
    

    public static void demoArraylist() {
        ArrayList<Drink> menus = CreateDrinkData();

        // Comparator<Drink> cmpPrice = new Comparator<Drink>() {

        //     @Override
        //     public int compare(Drink o1, Drink o2) {
                
        //         return o1.getPrice() - o2.getPrice();
        //     }
            
        // };
        Collections.sort(menus, new Comparator<Drink>() {

            @Override
            public int compare(Drink o1, Drink o2) {
                
                return -(o1.getPrice() - o2.getPrice());
            }
            
        });
        
    //System.out.println(menus.get(0));
        for (Drink menu : menus) {
            System.out.println(menu.toString());
        }
    }

    private static ArrayList<Drink> CreateDrinkData() {
        ArrayList<Drink> menus = new ArrayList<Drink>();
        menus.add(new Drink("orange", "juice", 40));
        menus.add(new Drink("Apple", "juice", 45));
        menus.add(new Drink("lemon", "juice", 50));
        menus.add(new Drink("Coke", "Soda", 25));
        menus.add(new Drink("Sprite", "Soda", 25));
        menus.add(new Drink("Fanta", "Soda", 25));
        menus.add(new Drink("Latte", "Coffee", 70));
        menus.add(new Drink("Mocha", "Coffee", 80));
        menus.add(new Drink("Cappuccino", "Coffee", 90));
        menus.add(new Drink("Espresso", "Coffee", 65));
        return menus;
    }
    public static void demoSortString() {
        ArrayList<Drink> menus = CreateDrinkData();
        for (Drink menu : menus) {
            System.out.println(menu.toString());
        }


        Collections.sort(menus, new Comparator<Drink>() {

            @Override
            public int compare(Drink o1, Drink o2) {
                if(o1.getCategory().equalsIgnoreCase(o2.getCategory())) {
                    return o1.getMenu().compareToIgnoreCase(o2.getMenu());
                } else {
                    return o1.getCategory().compareToIgnoreCase(o2.getCategory());
                }
                // return o1.getMenu().compareToIgnoreCase(o2.getMenu());
            }
        });
        System.out.println("------------------sorted by menu------------------");
        for (Drink menu : menus) {
            System.out.println(menu.toString());              
        }

    }
                                                    //อยากลาออก**


    public static void demoNaturalOrderSort() {
        ArrayList<Drink> menus = CreateDrinkData();
        for (Drink menu : menus) {
            System.out.println(menu.toString());
        }

        Collections.sort(menus);
        System.out.println("------------------sorted by menu------------------");
        for (Drink menu : menus) {
            System.out.println(menu.toString());
        }

    }

        
}




    //         System.out.println(".............................................");
    
    //         for (Drink menu : menus) {
    //             System.out.println(menu.toString());
    //         }
    //     }
        
    //     public static void demoSimpleArraylist() {
    //         ArrayList<String> fruits = new ArrayList<>();
    //         fruits.add("banana"); // 0
    //         fruits.add("orange"); // 1
    //         fruits.add("kiwi"); // 2
            
    //         System.out.println(fruits.get(1));
    //         System.out.println(fruits.indexOf("orange"));
    //         System.out.println(fruits.contains("kiwi"));
    //         fruits.add(1, "coconut");
    //         System.out.println(fruits.toString());
    //         System.out.println(fruits.get(2));
    //         fruits.add(0, "apple");
    //         System.out.println(fruits.toString());
    // fruits.set(1, "mango");       
    //         System.out.println(fruits.toString());
    
    //     }
    
    // public static void advArrayList() {
    //     ArrayList<Drink> menus = createDrinkData();
    //     for (Drink menu : menus) {
    //         System.out.println(menu.toString());
    //     }
    // }
