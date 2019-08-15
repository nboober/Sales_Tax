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

    public Books getBooks() {
        return books;
    }

    public void setBooks(Books books) {
        this.books = books;
    }

    public Chocolate getChocolate() {
        return chocolate;
    }

    public void setChocolate(Chocolate chocolate) {
        this.chocolate = chocolate;
    }

    public Perfume getPerfume() {
        return perfume;
    }

    public void setPerfume(Perfume perfume) {
        this.perfume = perfume;
    }

    public Medicine getMedicine() {
        return medicine;
    }

    public void setMedicine(Medicine medicine) {
        this.medicine = medicine;
    }

    public Music getMusic() {
        return music;
    }

    public void setMusic(Music music) {
        this.music = music;
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
