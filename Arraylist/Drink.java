package Arraylist;

 public class Drink implements Comparable<Drink> {
    private String menu, category;
    private int price;

    public Drink(String menu, String category, int price) {
        this.menu = menu;
        this.category = category;
        this.price = price;
    }

    public Drink() {
    }

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Drink [menu=" + menu + ", category=" + category + ", price=" + price + "]";
    }

    @Override
    public int compareTo(Drink o) {
        return this.getMenu().compareToIgnoreCase(o.getMenu());
        
    }
    

   
    
}
