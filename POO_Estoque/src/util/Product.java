package util;

public class Product {
    public String name;
    public double price;
    public int quantity;

    public double totalValueInStock(){
        double totalValue = quantity * price;
        return totalValue;
    }
    public void addProducts(int quantity){
        this.quantity += quantity;
    }

    public void removeProducts(int quantity){
        this.quantity -= quantity;
    }

    @Override
    public String toString() {
        return "Product " +
                "name ='" + name + '\'' +
                ", price = $" + String.format("%.2f", price) +
                ", quantity = " + quantity + " units" +
                ", Total Value = $" + String.format("%.2f",totalValueInStock());
    }
}
