public class PetrolPurchase {

    public String location;
    public String type;
    public int quantity;
    public double pricePerLiter;
    public double discount;

    public PetrolPurchase(String location, String type, int quantity,
                          double pricePerLiter, double discount) {
        this.location = location;
        this.type = type;
        this.quantity = quantity;
        this.pricePerLiter = pricePerLiter;
        this.discount = discount;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    public String getLocation() {
        return location;
    }

    public void setType(String type) {
        this.type = type;
    }
    public String getType() {
        return type;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public int getQuantity() {
        return quantity;
    }

    public void setPricePerLiter(double pricePerLiter) {
        this.pricePerLiter = pricePerLiter;
    }
    public double getPricePerLiter() {
        return pricePerLiter;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
    public double getDiscount() {
        return discount;
    }

    public double getPurchaseAmount() {
        double purchase = (quantity * pricePerLiter) - (quantity * pricePerLiter * discount / 100);
        return purchase;
    }

    public Object getStationLocation() {
        return null;
    }

    public Object getPetrolType() {
        return null;
    }

    public Object getQuantityPurchase() {
        return null;
    }

    public Object getPricePerLitre() {
        return null;
    }

    public Object getPercentageDiscount() {
        return null;
    }
}
