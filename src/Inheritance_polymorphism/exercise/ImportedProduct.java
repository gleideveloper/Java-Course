package Inheritance_polymorphism.exercise;

public class ImportedProduct extends Product{
    private Double customersFee;

    public ImportedProduct() {
    }

    public ImportedProduct(String name, Double price, Double customersFee) {
        super(name, price);
        this.customersFee = customersFee;
    }

    public Double getCustomersFee() {
        return customersFee;
    }

    public void setCustomersFee(Double customersFee) {
        this.customersFee = customersFee;
    }

    public double totalPrice(){
        return getPrice() + customersFee;
    }

    @Override
    public String priceTag(){
        return getName()
                + " $ "
                + String.format("%.2f", totalPrice())
                + " (Customs fee: $ "
                + String.format("%.2f", customersFee)
                + ")";
    }
}
