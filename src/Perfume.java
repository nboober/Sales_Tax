import java.text.NumberFormat;

public class Perfume{

    private int price;
    private int quantity;
    private int totalPrice;
    private boolean imported;
    private double tax;

    public Perfume(){

    }

    public Perfume(int quantity, boolean imported, int price){
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

    //This method multiplies the price of the product by 10% to get the sales tax. This will be applied to the total
    public double getTax() {

        return (this.getPrice() * .1) * this.getQuantity();
    }

    public void setTax(int tax) {
        this.tax = tax;
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

    //This method gets the total price for this product. This method multiplies the price by the quantity. The sales tax is only included in the Music and Perfume classes
    public double getTotalPrice() {
        return (this.getPrice() + this.getTax()) * this.getQuantity();
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
            return "Perfume" + ": " + total + " (" + this.getQuantity() + " @ " + price + ")";
        }
        return "Perfume" + ": " + total;
    }

}
