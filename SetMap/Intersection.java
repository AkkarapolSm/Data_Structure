package SetMap;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Intersection {
    
    private static Set<String> skills = new HashSet<>(Arrays.asList("Java","HTML5", "CSS3"));
    private static Map<String, Set<String>> applicants = new TreeMap<>();
    
    public static void main(String[] args) {
        createApplicants();
        System.out.println("list applicants");
        displayApplicant();

        System.out.println("skill required");
        System.out.println(skills.toString());

        System.out.println();
        System.out.println("Matched");
        findApplicantMatchSkills();

    }

    public static void createApplicants() {
        applicants.put("Peter", new HashSet<>(Arrays.asList("C++", "Ruby")));
        applicants.put("Bruce", new HashSet<>(Arrays.asList("HTML5", "Java", "CSS3", "Python")));
        applicants.put("Clark", new HashSet<>(Arrays.asList("C#", "IIS", "Java", "CSS3")));
        applicants.put("Linda", new HashSet<>(Arrays.asList("Java", "HTML5", "Javascript", "CSS3", "Ruby", "Python")));
    }
    public static void displayApplicant() {
        // for (Map.Entry<String, Set<String>> item : applicants.entrySet()) { //แบบที่ 1
        //     String key = item.getKey();
        //     Set value = item.getValue();
        //     System.out.printf("%s => %s\n", key, value);
        // }

        for (Map.Entry<String, Set<String>> item: applicants.entrySet()) { // แบบที่ 2 
            System.out.println(item.getKey() + item.getValue());
        }
    }

    public static void findApplicantMatchSkills() {
        // for (Map.Entry<String, Set<String>> item : applicants.entrySet()) { //แบบที่1
            
        //     String key = item.getKey();
        //     Set<String> value = item.getValue();

        //     Set<String> setA = new HashSet<>(skills);
        //     setA.retainAll(value);
        //     if(setA.size() == skills.size()) {
        //         System.out.printf("%s => %s\n", key, value);
        //     }

        // }

        for (Map.Entry<String, Set<String>> item : applicants.entrySet()) { //แบบที่2
            
            Set<String> setA = new HashSet<>(skills);

            Set<String> value = item.getValue();

            setA.retainAll(value);
            if(setA.size() == skills.size()) {
                System.out.println(item.getKey() + item.getValue());
            }
        }
    }
}

