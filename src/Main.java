import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        //Variables
        String cont;
        String product;
        int quantity;
        String imported;

        //New Order Object
        Order order = new Order();

        //Scanner import for user functionality
        Scanner scanner = new Scanner(System.in);

        //Beginning of do-while loop
        do{
            //Product Option Selection
            System.out.println("What would you like to order? See our list of items below (Please hit enter the first time this runs to begin) : \nBooks \nMusic CDs \nChocolate Bars \nPerfume \nMedicine \n");
            scanner.nextLine();
            System.out.println("I would like to order (without the quantity)... ");
            product = scanner.nextLine();

            //Product Import Option
            System.out.println("Would it need to be imported? (yes | no)");
            imported = scanner.nextLine().toLowerCase();

            //Product Import Option Loop for if an inappropriate option is chosen. Only yes or no is allowed
            while(!imported.equals("yes") && !imported.equals("no")){
                System.out.println("That choice is not an option. Please say yes or no.");
                System.out.println("Would it need to be imported?");
                imported = scanner.nextLine();
            }

            //Product Quantity Option Selection
            System.out.println("How much of that product would you like to order? ");
            quantity = scanner.nextInt();

            //Product Quantity Option Loop for if a number below 1 is selected. Only numbers greater than 0 allowed
            while(quantity <= 0){
                System.out.println("Please Enter a Quantity Greater than 0");
                System.out.println("How much of that product would you like to order? ");
                quantity = scanner.nextInt();
            }

            //setOrder function is called here to attach the chosen product and its information to the order array in the Order Class.
            //This needed information is returned from the selectedProduct Method
            //This controls what gets shown at the end in the receipt printout
            order.setOrder(selectedProduct(product, quantity, imported, order));

            //Checkout Option to add another item to the grocery List or checkout. This will restart the loop if yes is chosen
            System.out.println("Would you like to add more to your order? (yes | no)");
            cont = scanner.next().toLowerCase();

            //Checkout Loop. Only yes or no can be chosen, otherwise this will loop
            while(!cont.equals("yes") && !cont.equals("no")){
                System.out.println("That choice is not an option. Please say yes or no.");
                System.out.println("Would you like to add more to your order? (yes | no)");
                cont = scanner.next().toLowerCase();
            }

            //Receipt printout Function
            //If no is chosen during the Checkout option then the receipt will print and the program will end
            if(cont.equals("no")){
                System.out.println(order.toString());
            }

        //End of do-while loop. Requirements to end do-while loop is a no during the checkout option. Otherwise the program will loop
        }while(cont.equals("yes"));

    }

    //This method return the needed product information to the setOrder method
    public static String selectedProduct(String product, int quantity, String imported, Order order){

        String item = "";
        boolean needToBeImported = false;

        if(imported.equals("yes")){
            needToBeImported = true;
        }
        //If book is found in the product variable this information is returned
        if(product.toLowerCase().contains("book")){
            order.setBookQuantity(quantity);
            order.setBookImport(needToBeImported);
            order.setBookPrice(10);
            item = order.getBooks().toString();

        //If chocolate is found in the product variable this information is returned
        }else if(product.toLowerCase().contains("chocolate")){
            order.setChocolateQuantity(quantity);
            order.setChocolateImport(needToBeImported);
            order.setChocolatePrice(1);
            item = order.getChocolate().toString();

        //If perfume is found in the product variable this information is returned
        }else if(product.toLowerCase().contains("perfume")){
            order.setPerfumeQuantity(quantity);
            order.setPerfumeImport(needToBeImported);
            order.setPerfumePrice(50);
            item = order.getPerfume().toString();

        //If medicine or pill is found in the product variable this information is returned
        }else if(product.toLowerCase().contains("medicine") || product.toLowerCase().contains("pill")){
            order.setMedicineQuantity(quantity);
            order.setMedicineImport(needToBeImported);
            order.setMedicinePrice(100);
            item = order.getMedicine().toString();

        //If music is found in the product variable this information is returned
        }else if(product.toLowerCase().contains("music")){
            order.setMusicQuantity(quantity);
            order.setMusicImport(needToBeImported);
            order.setMusicPrice(5);
            item = order.getMusic().toString();
        }

        return item;
    }
}
