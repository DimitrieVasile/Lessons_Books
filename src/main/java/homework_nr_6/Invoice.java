package homework_nr_6;

public class Invoice {
    private String model;
    private String productDescription;
    private int quantity;
    private double price;

    public Invoice(String model, String productDescription, int quantity, double price) {
        this.model = model;
        this.productDescription = productDescription;
        this.quantity = quantity;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity > 0) {
            this.quantity = quantity;
        } else {
            this.quantity = 0;
        }

    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            this.price = 0;
        }
    }

    public double getAmount() {
        return quantity * price;
    }
}
