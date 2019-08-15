import java.text.NumberFormat;
import java.util.ArrayList;

public class Order {

    //Variables
    private int total;
    private double tax;
    private Books books;
    private Chocolate chocolate;
    private Perfume perfume;
    private Medicine medicine;
    private Music music;

    //When a new Order object is created all the sub products are created as new objects and linked to the order class through this constructor. This is a Composition relationship
    public Order(){
        books = new Books();
        chocolate = new Chocolate();
        perfume = new Perfume();
        medicine = new Medicine();
        music = new Music();
    }

    //Order arrayList. This stores the information from the selectedProduct method in the Main class
    ArrayList<String> order = new ArrayList<String>();

    //This Method returns the list of products stored in the order array
    public String getOrder() {

        String list = "";

        for(String product : order){
            list += product + "\n";
        }

        return list;
    }

    //This method is what adds the product info to the order arrayList. This is called in the Main class
    public void setOrder(String order) {
        this.order.add(order);
    }

    //Start of Object Setters and getters to store information from the Main Class for the Order class to reach
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
    //End of Object Setters and Getters

    //This method gets the tax information from the other classes
    public double getTax() {
        return perfume.getTax() + music.getTax();
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    //This method get the Total Price information from the other classes
    public double getTotal() {

        return books.getTotalPrice() + chocolate.getTotalPrice() + perfume.getTotalPrice() + medicine.getTotalPrice() + music.getTotalPrice();

    }

    public void setTotal(int total) {
        this.total = total;
    }

    //This is the Final toString method called in the Main class. This is the Receipt print out
    @Override
    public String toString(){

        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        String tax = formatter.format(this.getTax());
        String total = formatter.format(this.getTotal());


        return "------Receipt------\n" + this.getOrder() + "Sales Tax: " + tax + "\n" + "Total: " + total;
    }

}
