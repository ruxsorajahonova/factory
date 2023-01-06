package Factory;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

//name,address,phonenumber
public class Factory {
    private String fabName;
    private String address;
    private int phoneNumber;
    Set<Staff>staff=new HashSet<>();
    Set<Product>products=new HashSet<>();
    Set<Market>markets=new HashSet<>();

    public Factory(String fabName, String address, int phoneNumber) {
        this.fabName = fabName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.staff = staff;
        this.products = products;
        this.markets = markets;
    }

    public String getFabName() {
        return fabName;
    }

    public void setFabName(String fabName) {
        this.fabName = fabName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Set<Staff> getStaff() {
        return staff;
    }

    public void setStaff(Set<Staff> staff) {
        this.staff = staff;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }

    public Set<Market> getMarkets() {
        return markets;
    }

    public void setMarkets(Set<Market> markets) {
        this.markets = markets;
    }

    public void addStaffInFactory(Staff staff){
        getStaff().add(staff);
        System.out.println("saved");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Factory factory = (Factory) o;
        return phoneNumber == factory.phoneNumber && Objects.equals(fabName, factory.fabName) && Objects.equals(address, factory.address) && Objects.equals(staff, factory.staff) && Objects.equals(products, factory.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fabName, address, phoneNumber, staff, products);
    }
}
