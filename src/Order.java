import java.text.NumberFormat;
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
        books = new Books();
        chocolate = new Chocolate();
        perfume = new Perfume();
        medicine = new Medicine();
        music = new Music();
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

    public void setBookQuantity(int quantity){
        books.setQuantity(quantity);
    }

    public void setBookImport(boolean imported){
        books.setImported(imported);
    }

    public void setBookPrice(int price){
        books.setPrice(price);
    }

    public Chocolate getChocolate() {
        return chocolate;
    }

    public void setChocolate(Chocolate chocolate) {
        this.chocolate = chocolate;
    }

    public void setChocolateQuantity(int quantity){
        chocolate.setQuantity(quantity);
    }

    public void setChocolateImport(boolean imported){
        chocolate.setImported(imported);
    }

    public void setChocolatePrice(int price){
        chocolate.setPrice(price);
    }


    public Perfume getPerfume() {
        return perfume;
    }

    public void setPerfume(Perfume perfume) {
        this.perfume = perfume;
    }

    public void setPerfumeQuantity(int quantity){
        perfume.setQuantity(quantity);
    }

    public void setPerfumeImport(boolean imported){
        perfume.setImported(imported);
    }

    public void setPerfumePrice(int price){
        perfume.setPrice(price);
    }

    public Medicine getMedicine() {
        return medicine;
    }

    public void setMedicine(Medicine medicine) {
        this.medicine = medicine;
    }

    public void setMedicineQuantity(int quantity){
        medicine.setQuantity(quantity);
    }

    public void setMedicineImport(boolean imported){
        medicine.setImported(imported);
    }

    public void setMedicinePrice(int price){
        medicine.setPrice(price);
    }

    public Music getMusic() {
        return music;
    }

    public void setMusic(Music music) {
        this.music = music;
    }

    public void setMusicQuantity(int quantity){
        music.setQuantity(quantity);
    }

    public void setMusicImport(boolean imported){
        music.setImported(imported);
    }

    public void setMusicPrice(int price){
        music.setPrice(price);
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

        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        String tax = formatter.format(this.getTax());
        String total = formatter.format(this.getTotal());


        return "------Receipt------\n" + this.getOrder() + "Sales Tax: " + tax + "\n" + "Total: " + total;
    }

}
