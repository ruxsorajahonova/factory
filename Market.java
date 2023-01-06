package Factory;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Market {
    private String marketName;
    private String address;
    private int phoneNumber;
    Set<Product>products=new HashSet<>();
    Set<MarketStaff>marketStaffs=new HashSet();


    public Market(){}

    public Market(String marketName, String address, int phoneNumber) {
        this.marketName = marketName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.products = products;
        this.marketStaffs = marketStaffs;
    }

    public String getMarketName() {
        return marketName;
    }

    public void setMarketName(String marketName) {
        this.marketName = marketName;
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

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }

    public Set<MarketStaff> getMarketStaffs() {
        return marketStaffs;
    }

    public void setMarketStaffs(Set<MarketStaff> marketStaffs) {
        this.marketStaffs = marketStaffs;
    }

//    public void addProductInMarket(Product product){
//        getProducts().add(product);
//        System.out.println("saved");
//    }
//    public void addMarketStaffInMarket(MarketStaff marketStaff){
//        getMarketStaffs().add(marketStaff);
//        System.out.println("saved");
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Market market = (Market) o;
        return phoneNumber == market.phoneNumber && Objects.equals(marketName, market.marketName) && Objects.equals(address, market.address) && Objects.equals(products, market.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marketName, address, phoneNumber, products);
    }
}
