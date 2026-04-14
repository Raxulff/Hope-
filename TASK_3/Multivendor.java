import java.util.*;

public class Mulivendor {
    public static void main(String[] args){
        Admin admin = new Admin("Amazon");
        
        Vendor apple = new Vendor("Vendor", "Apple");
        apple.addProduct(new Product("iPhone 16", 1000.0));
        apple.addProduct(new Product("iPhone 17", 1100.0));
        apple.addProduct(new Product("iPhone 18", 1200.0));

        Vendor samsung = new Vendor("Vendor", "Samsung");
        samsung.addProduct(new Product("Galaxy S23", 800.0));
        samsung.addProduct(new Product("Galaxy S24", 900.0));

        Vendor vivo = new Vendor("Vendor", "Vivo");
        vivo.addProduct(new Product("V27", 400.0));
        vivo.addProduct(new Product("V29", 500.0));

        Vendor oppo = new Vendor("Vendor", "Oppo");
        oppo.addProduct(new Product("Reno 10", 450.0));
        oppo.addProduct(new Product("Reno 11", 550.0));

        buyProduct(apple, "iPhone 18", admin);
        buyProduct(samsung, "Galaxy S24", admin);
        buyProduct(vivo, "V29", admin);
        buyProduct(oppo, "Reno 10", admin);
        buyProduct(apple, "iPhone 16", admin);

        System.out.println("Admin Profit: $" + admin.getProfit());
        System.out.println("Apple Profit: $" + apple.getProfit());
        System.out.println("Samsung Profit: $" + samsung.getProfit());
        System.out.println("Vivo Profit: $" + vivo.getProfit());
        System.out.println("Oppo Profit: $" + oppo.getProfit());
    }

    public static void buyProduct(Vendor vendor, String productName, Admin admin) {
        if (vendor.getProducts().containsKey(productName)) {
            Product p = vendor.getProducts().get(productName);
            double adminCut = p.getPrice() * 0.10;
            double vendorCut = p.getPrice() - adminCut;
            admin.addProfit(adminCut);
            vendor.addProfit(vendorCut);
        }
    }
}

class User {
    protected String role;
    public User(String role){
        this.role = role;
    }   
}

class Admin extends User {
    private double profit = 0.0;
    public Admin(String role){
        super(role);
    }
    public void addProfit(double amount) {
        this.profit += amount;
    }
    public double getProfit() {
        return profit;
    }
}

class Vendor extends User {
    private String shopName;
    private double profit = 0.0;
    private HashMap<String, Product> products = new HashMap<>();

    public Vendor(String role, String shopName){
        super(role);
        this.shopName = shopName;
    }
    public void addProduct(Product p) {
        products.put(p.getName(), p);
    }
    public HashMap<String, Product> getProducts() {
        return products;
    }
    public void addProfit(double amount) {
        this.profit += amount;
    }
    public double getProfit() {
        return profit;
    }
    public String getShopName() {
        return shopName;
    }
}

class Product {
    private String name;
    private double price;
    
    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
}
