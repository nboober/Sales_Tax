import java.text.NumberFormat;

public class Chocolate{

    private int price;
    private int quantity;
    private int totalPrice;
    private boolean imported;

    public Chocolate(){

    }

    public Chocolate(int quantity, boolean imported, int price){
        this.setQuantity(quantity);
        this.setImported(imported);
        this.setPrice(price);
    }

    //This method gets the price of the Product. If it is imported then a 5% tax is added on to the total
    public double getPrice() {
        if(this.isImported()){
            return this.price * 1.05;
        }
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isImported() {
        return imported;
    }

    public void setImported(boolean imported) {
        this.imported = imported;
    }

    //This method gets the total price for this product. This method multiplies the price by the quantity
    public double getTotalPrice() {

        return this.getPrice() * this.getQuantity();
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    //This method is called in the Main Class in the selectedProduct method. This is the String stored in the Order array in teh Order Class
    @Override
    public String toString(){
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        String total = formatter.format(this.getTotalPrice());
        String price = formatter.format(this.getPrice());


        if(this.getQuantity() > 1){
            return "Chocolate" + ": " + total + " (" + this.getQuantity() + " @ " + price + ")";
        }
        return "Chocolate" + ": " + total;
    }

}
