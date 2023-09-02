package TreeMap;

import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        // treeMapdmo();
        int score = 40;
        System.out.println("---using if---");
        System.out.println(gradeLetterif(score));
        System.out.println("---using treeMap---");
        System.out.println(gradeLetterTreeMap(score));
    }

    public static void treeMapdmo() {
        TreeMap<Integer, String> m = new TreeMap<>();
        m.put(1133, "Inquire about the phone number");
        m.put(183, "Ask for a regional number.");
        m.put(189, "phone complaint");
        m.put(1177, "Report a phone malfunction (press 1177 followed by the phone number)");

        for (Map.Entry<Integer, String> item : m.entrySet()) {
            Integer key = item.getKey();
            String value = item.getValue();
            System.out.printf("%s - %s%n", key, value);
        }
    }

    public static String gradeLetterif(int score) {
        /*
        0 - 49 F
        50 - 59 D
        60 - 69 C
        70 - 79 B
        80 - 100 A
        */
        
        String grade = "";
        if (score >= 80) {
            grade = "A";
        } else if (score >= 70) {
            grade = "B";
        }else if (score >= 60) {
            grade = "C";
        }else if (score >= 50) {
            grade = "D";
        }else {
            grade = "F";
        }
        return grade;
        
    }
    public static String gradeLetterTreeMap(int score) {
        TreeMap<Integer, String> gradeMap = new TreeMap<Integer, String>();
        gradeMap.put(0, "F");  //(0 - 50)
        gradeMap.put(50, "D"); //(50 - 60)
        gradeMap.put(60, "C"); //(60 - 70)
        gradeMap.put(70, "B"); //(70 - 80)
        gradeMap.put(80, "A"); //(80)
        return gradeMap.floorEntry(score).getValue();
    }
}
