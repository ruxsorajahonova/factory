package Factory;


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Set<Staff>staff=new HashSet<>();
        Set<Product>products=new HashSet<>();
        Set<Factory>factories=new HashSet<>();
        Set<Market>markets=new HashSet<>();
        Set<MarketStaff>marketStaffs=new HashSet<>();

        int step=-1;
        while (step!=0){
            System.out.println("0=>exit, 1=>addFactory, 2=>editFactory 3=>getFactoryList,4=>addStaffInFactory,"+
                    "5=>getStaffInFactory,6=>editStaffInFactory, 7=>deleteStaffInFactory,8=>getStaffList,9=>addMarket"+
                    ",10=>editMarket,11=>getMarketList,12=>addProductInMarket,13=>getProductInMarket,14=>getProductList,"+
                    "15=>addMStaffInMarket, 16=>editMStaffInMarket, 17=>deleteMStaffInMarket, 18=>getMStaffInMarket");
            step= scanner.nextInt();
            switch(step){
                case 0:
                    break;
                case 1:
                    System.out.println("Fabrika nomini kiriting");
                    String fabName= scanner.next();
                    System.out.println("fabrika manzilini kiriting");
                    String address= scanner.next();
                    System.out.println("telefon raqamni kiriting");
                    int phoneNumber= scanner.nextInt();
                    factories.add(new Factory(fabName,address,phoneNumber));
                    System.out.println("succesfully saved factory");
                    break;
                case 2:
                    getFactoryList(factories);
                    System.out.println("Fabrikani tanlang");
                    int chooseFactory= scanner.nextInt();
                    int tr=0;
                    for (Factory factory : factories) {
                        tr++;
                        System.out.println(tr+"."+factory.getFabName());
                        if (chooseFactory==tr){
                            System.out.println("yangi fabrika nomini kiriting");
                            String newFabName= scanner.next();
                            factory.setFabName(newFabName);
                            System.out.println("successfully edited factory name");
                            break;
                        }
                    }
                case 3:
                    getFactoryList(factories);
                    break;
                case 4:
                    getFactoryList(factories);
                    System.out.println("fabrikani tanla");
                    int chooseFactory1= scanner.nextInt();
                    int tr1=0;
                    for (Factory factory : factories) {
                        tr1++;
                        System.out.println(tr1+"."+factory.getFabName());
                        if(chooseFactory1==tr1){
                            System.out.println("ismini kiriting");
                            String name= scanner.next();
                            System.out.println("familyasini kiriting");
                            String lastName= scanner.next();
                            System.out.println("yoshini kiriting");
                            int age= scanner.nextInt();
                            System.out.println("telefon raqamni kiriting");
                            int phoneNumber1= scanner.nextInt();
                            System.out.println("Mutaxasisligini kiriting");
                            String specialist= scanner.next();
                            System.out.println("kasbini kiriting");
                            String profession= scanner.next();
                            staff.add(new Staff(name,lastName,age,phoneNumber1,specialist,profession));
                            factory.getStaff().add(new Staff(name,lastName,age,phoneNumber1,specialist,profession));
                            System.out.println("saqlandi");
                            break;
                        }

                    }
                    break;
                case 5:
                   getFactoryList(factories);
                    System.out.println("fabrikani tanlang");
                    int choseFab= scanner.nextInt();
                    int trr=0;
                    for (Factory factory : factories) {
                        trr++;
                        if (choseFab==trr){
                            for (Staff staff1: factory.getStaff()){
                                System.out.println(staff1.getName());
                                break;
                            }
                        }
                    }

                   break;
                case 6:
                    getFactoryList(factories);
                    System.out.println("fabrikani tanlang");
                    int chooseFactory2= scanner.nextInt();
                    int tr2=0;
                    for (Factory factory : factories) {
                        tr2++;
                        if (chooseFactory2==tr2){
                            getStaffList(factory.getStaff());
                            System.out.println("xodimni tanlang");
                            int chooseFactory3= scanner.nextInt();
                            int tr3=0;
                            for (Staff staff1: factory.getStaff()){
                                tr3++;
                                if (chooseFactory3==tr3){
                                    for (Staff staff2 : staff) {
                                        System.out.println("yangi nomini kiriting");
                                        String newFactoryName= scanner.next();
                                        staff1.setName(newFactoryName);
                                        staff2.setName(newFactoryName);
                                        System.out.println("tahrirlandi");
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    break;
                case 7:
                    getFactoryList(factories);
                    System.out.println("fabrikani tanlang");
                    int choosefactory= scanner.nextInt();
                    int tr3=0;
                    for (Factory factory : factories) {
                        tr3++;
                        if(choosefactory==tr3){
                            getStaffList(factory.getStaff());
                            System.out.println("xodimlarni tanlang");
                            int choose= scanner.nextInt();
                            int tr4=0;
                            for (Staff staff1: factory.getStaff()){
                                tr4++;
                                if (choose==tr4){
                                    staff.remove(staff1);
                                    factory.getStaff().remove(staff1);
                                    System.out.println("o'chirildi");
                                    break;
                                }
                            }
                        }

                    }
                    break;
                case 8:
                    getStaffList(staff);
                    break;
                case 9:
                    System.out.println("do'konning nomini kiriting");
                    String marketName= scanner.next();
                    System.out.println("manzilini kiriting");
                    String addres= scanner.next();
                    System.out.println("telefon raqamni kiriting");
                    int phonenumber= scanner.nextInt();
                    markets.add(new Market(marketName,addres,phonenumber));
                    System.out.println("successfully saved market");
                    break;
                case 10:
                    getMarketList(markets);
                    System.out.println("tanlang");
                    int chooseMarket= scanner.nextInt();
                    int tr4=0;
                    for (Market market : markets) {
                        tr4++;
                        if (chooseMarket==tr4){
                            System.out.println("yangi nomni kiriting");
                            String newMarketName= scanner.next();
                            market.setMarketName(newMarketName);
                            System.out.println("tahrirlandi");
                            break;
                        }
                    }
                    break;
                case 11:
                    getMarketList(markets);
                    break;
                case 12:
                    getMarketList(markets);
                    System.out.println("tanlang");
                    int chooseMarket1=scanner.nextInt();
                    int tr5=0;
                    for (Market market : markets) {
                        tr5++;
                        if( chooseMarket1==tr5){
                            System.out.println("mahsulotning nomini kiriting");
                            String proName= scanner.next();
                            System.out.println("narxini kiriting");
                            double price= scanner.nextDouble();
                            System.out.println("mahsulotning turini kiriting");
                            String type= scanner.next();
                            System.out.println("qayerda ishlab chiqarilgan");
                            String madeIn= scanner.next();
                            products.add(new Product(proName,price,type,madeIn));
                            market.getProducts().add(new Product(proName,price,type,madeIn));
                            System.out.println("saved");
                            break;
                        }
                    }
                    break;
                case 13:
                    getMarketList(markets);
                    System.out.println("tanlang");
                    int choseMarket=scanner.nextInt();
                    int tr6= 0;
                    for (Market market : markets) {
                        tr6++;
                        if (choseMarket==tr6){
                            for (Product product:market.getProducts()){
                                System.out.println(product.getProName());
                                break;
                            }
                        }
                    }
                    break;
                case 14:
                    getProductList(products);
                    break;
                case 15:
                    getMarketList(markets);
                    System.out.println("tanlang");
                    int chooseMarket2= scanner.nextInt();
                    int tr7=0;
                    for (Market market : markets) {
                        tr7++;
                        if (chooseMarket2==tr7){
                            System.out.println("ismini kiriting");
                            String name1= scanner.next();
                            System.out.println("familyasini kiriting");
                            String lastName1= scanner.next();
                            System.out.println("yoshini kiriting");
                            int age1= scanner.nextInt();
                            System.out.println("telefon raqamni kiriting");
                            int phoneNumber11= scanner.nextInt();
                            marketStaffs.add(new MarketStaff(name1,lastName1,age1,phoneNumber11));
                            market.getMarketStaffs().add(new MarketStaff(name1,lastName1,age1,phoneNumber11));
                            System.out.println("successfully saved staff in market");
                        }
                    }
                    break;
                case 16:
                    getMarketList(markets);
                    System.out.println("tanlang");
                    int choseMar= scanner.nextInt();
                    int aylan=0;
                    for (Market market : markets) {
                        aylan++;
                        if (choseMar==aylan){
                            getMStaffList(market.getMarketStaffs());
                            System.out.println("xodimni tanlang");
                            int choseMStaff= scanner.nextInt();
                            int tt=0;
                            for (MarketStaff marketStaff : market.getMarketStaffs()) {
                                tt++;
                                if(choseMStaff==tt){
                                    for (MarketStaff marketStaff1 : marketStaffs) {
                                        System.out.println("yangi ism kirting");
                                        String newMStaffName= scanner.next();
                                        marketStaff1.setName(newMStaffName);
                                        marketStaff.setName(newMStaffName);
                                        System.out.println("tahrirlandi");
                                        break;

                                    }
                                }
                            }
                        }
                    }
                    break;
                case 17:
                    getMarketList(markets);
                    System.out.println("tanlang");
                    int tanla= scanner.nextInt();
                    int tr8=0;
                    for (Market market : markets) {
                        tr8++;
                        if (tanla==tr8){
                          getMStaffList(market.getMarketStaffs());
                            System.out.println("xodimni tanlang");
                            int XodimTanla= scanner.nextInt();
                            int tr9=0;
                            for (MarketStaff marketStaff : market.getMarketStaffs()) {
                                tr9++;
                                if (XodimTanla==tr9){
                                    staff.remove(marketStaff);
                                    market.getMarketStaffs().remove(marketStaff);
                                    System.out.println("o'chirildi");
                                    break;
                                }
                            }

                        }

                    }
                    break;
                case 18:
                    getMarketList(markets);
                    System.out.println("tanlang");
                    int tanlamarket= scanner.nextInt();
                    int tt1=0;
                    for (Market market : markets) {
                        tt1++;
                        if (tanlamarket==tt1){
                            for (MarketStaff marketStaff : market.getMarketStaffs()) {
                                System.out.println(marketStaff.getName());
                                break;
                            }
                        }
                    }
                    break;


            }
        }
    }
    public static void getFactoryList(Set<Factory>factories){
        int tr=0;
        for (Factory factory : factories) {
            tr++;
            System.out.println(tr+"."+factory.getFabName());

        }
    }
    public static void getStaffList(Set<Staff>staff){
        int tr=0;
        for (Staff staff1 : staff) {
            tr++;
            System.out.println(tr+"."+staff1.getName());

        }
    }
    public  static void getMarketList(Set<Market>markets){
        int tr=0;
        for (Market market : markets) {
            tr++;
            System.out.println(tr+"."+market.getMarketName());
        }
    }
    public static void getProductList(Set<Product>products){
        int tr=0;
        for (Product product : products) {
            tr++;
            System.out.println(tr+"."+product.getProName());
        }
    }
    public static void getMStaffList(Set<MarketStaff>marketStaffs){
        int tr=0;
        for (MarketStaff marketStaff : marketStaffs) {
            tr++;
            System.out.println(tr+"."+marketStaff.getName());
        }
    }




}
