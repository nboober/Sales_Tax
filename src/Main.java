import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        String cont;
        String product;
        int quantity;
        String imported;

        Books book = new Books();
        Chocolate chocolate = new Chocolate();
        Perfume perfume = new Perfume();
        Medicine medicine = new Medicine();
        Music music = new Music();
        Order order = new Order();
        order.setBooks(book);
        order.setChocolate(chocolate);
        order.setPerfume(perfume);
        order.setMedicine(medicine);
        order.setMusic(music);

        Scanner scanner = new Scanner(System.in);

        do{
            System.out.println("What would you like to order? See our list of items below: \nBooks \nMusic CDs \nChocolate Bars \nPerfume \nMedicine \n");
            scanner.nextLine();
            System.out.println("I would like to order (without the quantity)... ");
            product = scanner.nextLine();

            System.out.println("Would it need to be imported? (yes | no)");
            imported = scanner.nextLine().toLowerCase();

            while(!imported.equals("yes") && !imported.equals("no")){
                System.out.println("That choice is not an option. Please say yes or no.");
                System.out.println("Would it need to be imported?");
                imported = scanner.nextLine();
            }


            System.out.println("How much of that product would you like to order? ");
            quantity = scanner.nextInt();

            while(quantity <= 0){
                System.out.println("Please Enter a Quantity Greater than 0");
                System.out.println("How much of that product would you like to order? ");
                quantity = scanner.nextInt();
            }

            order.setOrder(selectedProduct(product, quantity, imported, book, chocolate, perfume, medicine, music));

            System.out.println("Would you like to add more to your order? (yes | no)");
            cont = scanner.next().toLowerCase();

            while(!cont.equals("yes") && !cont.equals("no")){
                System.out.println("That choice is not an option. Please say yes or no.");
                System.out.println("Would you like to add more to your order? (yes | no)");
                cont = scanner.next().toLowerCase();
            }

            if(cont.equals("no")){
                System.out.println(order.toString());
            }

        }while(cont.equals("yes"));

    }

    public static String selectedProduct(String product, int quantity, String imported, Books book, Chocolate chocolate, Perfume perfume, Medicine medicine, Music music){

        String item = "";
        boolean needToBeImported = false;

        if(imported.equals("yes")){
            needToBeImported = true;
        }

        if(product.toLowerCase().contains("book")){
            book.setQuantity(quantity);
            book.setImported(needToBeImported);
            book.setPrice(10);
            item = book.toString();
        }else if(product.toLowerCase().contains("chocolate")){
            chocolate.setQuantity(quantity);
            chocolate.setImported(needToBeImported);
            chocolate.setPrice(1);
            item = chocolate.toString();
        }else if(product.toLowerCase().contains("perfume")){
            perfume.setQuantity(quantity);
            perfume.setImported(needToBeImported);
            perfume.setPrice(50);
            item = perfume.toString();
        }else if(product.toLowerCase().contains("medicine") || product.toLowerCase().contains("pills")){
            medicine.setQuantity(quantity);
            medicine.setImported(needToBeImported);
            medicine.setPrice(100);
            item = medicine.toString();
        }else if(product.toLowerCase().contains("music")){
            music.setQuantity(quantity);
            music.setImported(needToBeImported);
            music.setPrice(5);
            item = music.toString();
        }

        return item;
    }
}
