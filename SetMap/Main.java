package SetMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    
    public static void main(String[] args) {
        // demo1();
        // demo2();
        demo3();
    }

    public static void demo1() {
        Set<String> setA = new HashSet<String>();
        setA.add("mango");
        setA.add("banana");
        setA.add("orange");
        setA.add("banana");
        System.out.printf("%s%n", setA);
    }

    public static void demo2() {
        Set<String> setB = new HashSet<String>(Arrays.asList("mango", "banana", "orange", "banana"));
        System.out.printf("%s%n", setB);                                               
    }

    public static void demo3() {
        List<String> fruits = new ArrayList<String>(Arrays.asList("mango", "banana", "orange", "banana"));

        Set<String> setA = new HashSet<String>(fruits);
        Set<String> setB = new LinkedHashSet<String>(fruits);
        Set<String> setC = new TreeSet<String>(fruits);

        System.out.printf("HashSet      : %s%n", setA); // ไม่มีการเรียงลำดับของข้อมูล
        System.out.printf("LinkedHashSet: %s%n", setB); // เรียงลำดับข้อมูลที่ใส่เข้าไป
        System.out.printf("TreeSet      : %s%n", setC); // เรียงลำดับข้อมูลตามตัวอักษร
    }
}
