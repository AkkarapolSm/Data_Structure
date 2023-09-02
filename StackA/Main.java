package StackA;

import java.util.Stack;

public class Main {
    
    public static void main(String[] args) {
        // demo();
        String s = "Akkarapol";
        System.out.println(reverseString(s));
    }

    public static void demo() {
        Stack<String> st = new Stack<>();
        st.push("mango");
        st.push("coconut");
        st.push("banana");
        st.push("apple");
        st.push("kiwi");
        st.push("orange");

        System.out.println(st);
        
        System.out.println(st.peek()); //ขอดูข้อมูลตัวบนสุดโดยที่ไม่ได้ลบข้อมูลออกจาก Stack
        System.out.println(st);
        
        System.out.println(st.pop()); //ขอดูข้อมูลตัวบนสุดโดยที่ลบข้อมูลออกจาก Stack
        System.out.println(st);
        
        System.out.println(st.search("kiwi")); // output sequence 0, 1, 2, 3, ....
        System.out.println(st.search("apple")); // output sequence 0, 1, 2, 3, ....
        System.out.println(st.search("coconut")); // output sequence 0, 1, 2, 3, ....
        
        System.out.println(st.contains("apple")); //output boolean
        System.out.println(st.contains("wotermelon")); //output boolean

        System.out.println("....popping...");
        while (!st.empty()) { // emtry คือ เช็คข้อมมูลว่ามีใน Stack หรือไม่
            System.out.println(st.pop()); // ข้อมูลจะ pop ออกจาก Stack เรื่อยๆ
        }
    }
    
    public static String reverseString(String s) {
        // Akkarapol -> loparakkA
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            st.push(s.charAt(i)); // ดึงตัวอักษรออกมาทีละตัว
            System.out.println(st);
        }
        StringBuilder sb  = new StringBuilder();
        while (!st.empty()) {
            System.out.println(st.peek());
            sb.append(st.pop());
        }
        return sb.toString();
    }
}
