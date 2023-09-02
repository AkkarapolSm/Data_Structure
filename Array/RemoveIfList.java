package Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveIfList {
    public static void main(final String[] args) {
        System.out.println("Demonstration of removeIf");
        final List<String> l1 = createList();
        // remove all items which contains an "x"
        l1.removeIf(s-> s.toLowerCase().contains("x"));
        l1.forEach(s->System.out.println(s));
    }
    private static List<String> createList() {
        List<String> anotherList = new ArrayList<>();
        anotherList.addAll(Arrays.asList("iphone", "Ubuntu", "Android", " Mac os x"));
        return anotherList;
    }

}
