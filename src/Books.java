public class Books{

    private int price;
    private int quantity;
    private int totalPrice;
    private boolean imported;

    public Books(){

    }

    public Books(int quantity, boolean imported, int price){
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

            return this.getPrice() * this.getQuantity();
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString(){
        if(this.getQuantity() > 1){
            return "Books" + ": " + "$" + this.getTotalPrice() + " (" + this.getQuantity() + " @ " + "$" + this.getPrice() + ")";
        }
              return "Books" + ": " + "$" + this.getTotalPrice();
    }
}
