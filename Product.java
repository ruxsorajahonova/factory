package Factory;

import java.util.Objects;

//proname,price,type,ishlab ciqarish joyi
public class Product {
    private String proName;
    private double price;
    private String type;
    private String madeIn;


    public Product(){}

    public Product(String proName, double price, String type, String madeIn) {
        this.proName = proName;
        this.price = price;
        this.type = type;
        this.madeIn = madeIn;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMadeIn() {
        return madeIn;
    }

    public void setMadeIn(String madeIn) {
        this.madeIn = madeIn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return price == product.price && Objects.equals(proName, product.proName) && Objects.equals(type, product.type) && Objects.equals(madeIn, product.madeIn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(proName, price, type, madeIn);
    }
}
