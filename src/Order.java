import java.util.ArrayList;

public class Order {

    private int total;
    private double tax;
    private Books books;
    private Chocolate chocolate;
    private Perfume perfume;
    private Medicine medicine;
    private Music music;

    public Order(){
        this.books = new Books();
        this.chocolate = new Chocolate();
        this.perfume = new Perfume();
        this.medicine = new Medicine();
        this.music = new Music();

    }

    ArrayList<String> order = new ArrayList<String>();

    public String getOrder() {

        String total = "";

        for(String product : order){
            total += product + "\n";
        }

        return total;
    }

    public void setOrder(String order) {
        this.order.add(order);
    }

    public double getTax() {
        return perfume.getTax() + music.getTax();
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public double getTotal() {

        return books.getTotalPrice() + chocolate.getTotalPrice() + perfume.getTotalPrice() + medicine.getTotalPrice() + music.getTotalPrice();

    }

    public void setTotal(int total) {
        this.total = total;
    }

    @Override
    public String toString(){

        return "------Receipt------\n" + this.getOrder() + "Sales Tax: " + this.getTax() + "\n" + "Total: " + this.getTotal();
    }

}
