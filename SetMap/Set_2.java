package SetMap;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Set_2 {
    
    public static void main(String[] args) {
        // uniondemo();
        // uniondemo2();
        // intersectiondemo();
        differencedemo();
    }

    public static void uniondemo() {
        Set<String> setA = new HashSet<>(Arrays.asList("A", "B", "C")); // HashSet<String>();
        Set<String> setB = new HashSet<>(Arrays.asList("B", "C", "D", "E", "F")); // HashSet<String>();
        
        System.out.printf("SetA = %s%n", setA);
        System.out.printf("SetA = %s%n", setB);
        
        setA.addAll(setB); //setA union setB
        
        System.out.printf("SetA = %s%n", setA);
    }

    public static void uniondemo2() {
        Set<String> setA = new HashSet<>(Arrays.asList("A", "B", "C")); // HashSet<String>();
        Set<String> setB = new HashSet<>(Arrays.asList("B", "C", "D", "E", "F")); // HashSet<String>();
        
        System.out.printf("SetA = %s%n", setA);
        System.out.printf("SetB = %s%n", setB);
        
        Set<String> setC = new HashSet<>();
        setC.addAll(setA);
        setC.addAll(setB);
    
        System.out.printf("SetC = %s%n", setC);
    }
    
    
    
    public static void intersectiondemo() {
        Set<String> setA = new HashSet<>(Arrays.asList("A", "B", "C")); // HashSet<String>();
        Set<String> setB = new HashSet<>(Arrays.asList("B", "C", "D", "E", "F")); // HashSet<String>();
        
        System.out.printf("SetA = %s%n", setA);
        System.out.printf("SetB = %s%n", setB);
        
        Set<String> setC = new HashSet<>(setA);
        
        setC.retainAll(setB); //setA intersec setB
        
        System.out.printf("SetC = %s%n", setC);
    }
    
    public static void differencedemo() {
        Set<String> setA = new HashSet<>(Arrays.asList("A", "B", "C")); // HashSet<String>();
        Set<String> setB = new HashSet<>(Arrays.asList("B", "C", "D", "E", "F")); // HashSet<String>();
        
        System.out.printf("SetA = %s%n", setA);
        System.out.printf("SetB = %s%n", setB);
        
        Set<String> setC = new HashSet<>(setA);
        
        setC.removeAll(setB); //setA difference setB
        
        System.out.printf("SetC = %s%n", setC);
    }
}

