package HashMap.MapNatoPhonetic;

import java.util.LinkedHashMap;
import java.util.Map;

public class NatoPhonetic {
    
    private static Map<String, String> m = new LinkedHashMap<>();

    static {
        m.put("A","Alfa");
        m.put("B","Bravo");
        m.put("C","Charlie");
        m.put("D","Delta");
        m.put("E","Echo");
        m.put("F","Foxtrot");
        m.put("G","Golf");
        m.put("H","Hotel");
        m.put("I","India");
        m.put("G","Juliett");
        m.put("K","Kilo");
        m.put("L","Lima");
        m.put("M","Mike");
        m.put("N","November");
        m.put("O","Oscar");
        m.put("P","Papa");
        m.put("Q","Quebec");
        m.put("R","Romeo");
        m.put("S","Sierra");
        m.put("T","Tango");
        m.put("U","Uniform");
        m.put("V","Victor");
        m.put("W","Whiskey");
        m.put("X","Xray, x-ray");
        m.put("Y","Yankee");
        m.put("Z","Zulu");
        m.put("1","One, unaone");
        m.put("2","Two, bissotwo");
        m.put("3","Three, terrathree");
        m.put("4","Four, kartefour");
        m.put("5","Five, pantafive");
        m.put("6","Six, soxisix");
        m.put("7","Seven, setteseven");
        m.put("8","Eight, oktoeight");
        m.put("9","Nine, novenine");
        m.put("0","Zero, nadazero");
    }
    public static Map<String, String> getM() {return m;}

    public  static String toPhonetic(String s) {
        StringBuffer sb = new StringBuffer();
        String c = "";
        for (int i = 0; i < s.length(); i++) {
            c = s.substring(i, i + 1).toUpperCase();
            if (m.containsKey(c)) {
                sb.append(String.format("%s - %s%n", c, m.get(c)));
            } else {
                sb.append(String.format("%s - %s%n", c, c));
            }
        }
        return sb.toString();
    }

    
    public static void displayNatoPhoneticTable(){
        for (Map.Entry<String, String> item : m.entrySet()){
        System.out.printf("%s - %s\n", item.getKey(), item.getValue());
        }
    }
}
