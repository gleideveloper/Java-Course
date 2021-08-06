package entities;

public class Product {
    private String name;
    private Double price;

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double  getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    //Interface funcional Predicate
    public static boolean staticProdPredicate(Product p){
        return p.getPrice() >= 100;
    }
    public boolean noStaticProdPredicate(){
        return price >= 100;
    }

    //Interface funcional Consumer
    public static void staticPriceUpdate(Product p){
        p.setPrice(p.getPrice() * 1.1);
    }
    public void noStaticPriceUpdate(){
        price = price * 1.1;
    }

    //Interface funcional Function
    public static String staticUpperCaseName(Product p){
        return p.getName().toUpperCase();
    }

    public String noStaticUpperCaseName(){
        return name.toUpperCase();
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                "| price=" + price +
                '}';
    }
}
