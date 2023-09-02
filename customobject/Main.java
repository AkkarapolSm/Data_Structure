package customobject;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.time.LocalDate;
import java.time.Month;

public class Main {
    private static Map<City, Temperature> m = new LinkedHashMap<>();


    public static void main(String[] args) {
        createData();
        displayData();
        System.out.println("...............................................");
        // findData(new City("bkk", LocalDate.of(2014, Month.NOVEMBER, 10)));
        // findbyCityName("Tak");
        // findbyCityNameUsingLambda("Tak");
        findBydateUsingLambda(LocalDate.of(2014, Month.NOVEMBER, 3));
    }

    public static void createData() {
            m.put(new City("bkk", LocalDate.of(2014, Month.NOVEMBER, 1)), new Temperature(33f, 27f));
            m.put(new City("bkk", LocalDate.of(2014, Month.NOVEMBER, 2)), new Temperature(31f, 26f));
            m.put(new City("bkk", LocalDate.of(2014, Month.NOVEMBER, 3)), new Temperature(35f, 25f));
            m.put(new City("bkk", LocalDate.of(2014, Month.NOVEMBER, 4)), new Temperature(34f, 22f));

            m.put(new City("tak", LocalDate.of(2014, Month.NOVEMBER, 1)), new Temperature(35f, 22f));
            m.put(new City("tak", LocalDate.of(2014, Month.NOVEMBER, 2)), new Temperature(39f, 21f));
            m.put(new City("tak", LocalDate.of(2014, Month.NOVEMBER, 3)), new Temperature(38f, 27f));
            m.put(new City("tak", LocalDate.of(2014, Month.NOVEMBER, 4)), new Temperature(37f, 25f));
            m.put(new City("tak", LocalDate.of(2014, Month.NOVEMBER, 4)), new Temperature(37f, 25f));
    }

    public static void displayData() {
        for (Map.Entry<City, Temperature> item : m.entrySet()) {
            City key = item.getKey();
            Temperature value = item.getValue();
            System.out.printf("%s => %s\n", key, value);
            
        }
    }
    public static void findData(City city) {
        if (m.containsKey(city)) {
            System.out.printf("found: %s %s", city, m.get(city));
        } else {
            System.out.printf("unable to find %s", city);
        }
    }
    public static void findbyCityName(String cityName) {
        Set<City> cities = m.keySet();
        // for (City city : cities) {
        //     System.out.println(city);
        // }
        List<City> list = new ArrayList<>();
        for (City city : cities) {
            if (city.getName().equalsIgnoreCase(cityName)) {
                list.add(city);
            }
        }
        for (City city : list) {
            System.out.printf("%s - %s%n", city, m.get(city));
        }
    }

    public static void findbyCityNameUsingLambda(String cityName) {
        Set<City> cities = m.keySet();

        List<City> list = cities.stream()
        .filter(p->p.getName().equalsIgnoreCase(cityName))
        .collect(Collectors.<City>toList()) ;
        
        for (City city : list) {
            System.out.printf("%s - %s%n", city, m.get(city));
        }
    }
    public static void findBydateUsingLambda(LocalDate date) {
        Set<City> cities = m.keySet();

        List<City> list = cities.stream()
        .filter(p->p.getDate().equals(date))
        .collect(Collectors.<City>toList()) ;
        
        for (City city : list) {
            System.out.printf("%s - %s%n", city, m.get(city));
        }

    }
}