//package HashMap.Country;

public class Country {

    private String nameth, nameEn;

    public Country(String nameth, String nameEn) {
        this.nameth = nameth;
        this.nameEn = nameEn;
    }

    public String getNameth() {
        return nameth;
    }

    @Override
    public String toString() {
        return "Country [nameth=" + nameth + ", nameEn=" + nameEn + "]";
    }

    public void setNameth(String nameth) {
        this.nameth = nameth;
    }

    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }
}
