public class Std {
    private String Name;
    private String Age;


    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public String getAge() {
        return Age;
    }
    public void setAge(String age) {
        Age = age;
    }

    public Std(String name, String age) {
        Name = name;
        Age = age;
    }
    @Override
    public String toString() {
        return "Std [Name = " + Name + ", Age = " + Age + "]";
    }
    
    

    
}
