package HashMap.MapNatoPhonetic;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        // NatoPhonetic.displayNatoPhoneticTable();
        demo();
    }

    public static void demo() {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("enter data (blank line to exit) : ");
            String s = "";
            while ((s = in.nextLine()).length() > 0) {
                System.out.println(NatoPhonetic.toPhonetic(s));
                System.out.println("enter data (blank line to exit) : ");
            }
        }
    }
}
