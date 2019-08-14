import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        String cont;
        String product;
        int quantity;
        String imported;

        Order order = new Order();

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

            order.setOrder(selectedProduct(product, quantity, imported, order));

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

    public static String selectedProduct(String product, int quantity, String imported, Order order){

        String item = "";
        boolean needToBeImported = false;

        if(imported.equals("yes")){
            needToBeImported = true;
        }

        if(product.toLowerCase().contains("book")){
            Books book = new Books(quantity, needToBeImported, 10);
            order.setBooks(book);
            item = book.toString();
        }else if(product.toLowerCase().contains("chocolate")){
            Chocolate chocolate = new Chocolate(quantity, needToBeImported, 1);
            order.setChocolate(chocolate);
            item = chocolate.toString();
        }else if(product.toLowerCase().contains("perfume")){
            Perfume perfume = new Perfume(quantity, needToBeImported, 50);
            order.setPerfume(perfume);
            item = perfume.toString();
        }else if(product.toLowerCase().contains("medicine") || product.toLowerCase().contains("pills")){
            Medicine medicine = new Medicine(quantity, needToBeImported, 100);
            order.setMedicine(medicine);
            item = medicine.toString();
        }else if(product.toLowerCase().contains("music")){
            Music music = new Music(quantity, needToBeImported, 5);
            order.setMusic(music);
            item = music.toString();
        }

        return item;
    }
}
