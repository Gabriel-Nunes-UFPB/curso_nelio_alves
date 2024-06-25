package products;

public class ImportedProduct extends Product{
    private Double customsFee;

    public ImportedProduct(String name, double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public Double totalPrice(){
        return super.getPrice() + customsFee;
    }

    @Override
    public String priceTag(){
        return super.getName() + " $ " + String.format("%.2f", totalPrice())+ " (Custom Fee: $ " + String.format("%.2f", customsFee) + ")";
    }

}
