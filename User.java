public class User {
    private String id;
    private String Password;


    public User(String id, String password) {
        this.id = id;
        Password = password;
    }


    @Override
    public String toString() {
        return "User [id = " + id + ", Password = " + Password + "]";
    }


    public String getId() {
        return id;
    }


    public void setId(String id) {
        this.id = id;
    }


    public String getPassword() {
        return Password;
    }


    public void setPassword(String password) {
        Password = password;
    }
    
    

    
    
}
