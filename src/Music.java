import java.text.NumberFormat;

public class Music{

    private int price;
    private int quantity;
    private int totalPrice;
    private boolean imported;
    private double tax;

    public Music(){

    }

    public Music(int quantity, boolean imported, int price){
        this.setQuantity(quantity);
        this.setImported(imported);
        this.setPrice(price);
    }

    public double getPrice() {
        if(this.isImported()){
            return this.price * 1.05;
        }
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getTax() {

        return this.getPrice() * .1;
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

    public double getTotalPrice() {
        return (this.getPrice() + this.getTax()) * this.getQuantity();
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString(){
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        String total = formatter.format(this.getTotalPrice());
        String price = formatter.format(this.getPrice());


        if(this.getQuantity() > 1){
            return "Music CDs" + ": " + total + " (" + this.getQuantity() + " @ " + price + ")";
        }
        return "Music CD" + ": " + total;
    }

}
