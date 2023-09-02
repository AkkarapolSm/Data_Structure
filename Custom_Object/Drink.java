package Custom_Object;

import java.util.Comparator;

public class Drink implements Comparable<Drink> {
    private String menu;
    private float price;



    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((menu == null) ? 0 : menu.toUpperCase().hashCode());
        result = prime * result + Float.floatToIntBits(price);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Drink other = (Drink) obj;
        if (menu == null) {
            if (other.menu != null)
                return false;
        } else if (!menu.toUpperCase().equals(other.menu.toUpperCase()))
            return false;
        if (Float.floatToIntBits(price) != Float.floatToIntBits(other.price))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Drink [menu=" + menu + ", price=" + price + "]";
    }

    public Drink(String menu, float price) {
        this.menu = menu;
        this.price = price;
    }
    
    public String getMenu() {
        return menu;
    }
    public void setMenu(String menu) {
        this.menu = menu;
    }
    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }

    // เรียงราคาจากน้อยไปมาก
    public static Comparator<Drink> byPriceName() { //Method
        Comparator<Drink> cmp = new Comparator<Drink>() {
            @Override
             public int compare(Drink o1, Drink o2) {
                if(Float.compare(o1.getPrice(), o2.getPrice()) == 0) {
                    return o1.getMenu().compareToIgnoreCase(o2.getMenu());
                }else {
                    return Float.compare(o1.getPrice(), o2.getPrice());
                }
            } 
        };
        return cmp;
    }
    
    // เรียงจากมากไปน้อย
    public static Comparator<Drink> byNameDescending() { //Method
        Comparator<Drink> cmp = new Comparator<Drink>() {
            @Override
             public int compare(Drink o1, Drink o2) {
                return o2.getMenu().compareToIgnoreCase(o1.getMenu());      
            }
        };
        return cmp;
    }

    @Override
    public int compareTo(Drink o) {
        
        return Float.compare(this.getPrice(), o.getPrice()); // เรียงตามราคาน้อยไปมาก หรือมากไปน้อย
        // return this.getMenu().compareToIgnoreCase(o.getMenu()); //เรียงตามตัวอักษร
    }

    
}
