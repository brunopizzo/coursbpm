import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ////////////////////
        // YOUR CODE HERE...

//        PizzaType pizzaType = selectPizza();
//        String address = selectAddress();
//        confirmOrder(pizzaType,address);




    }

    public static PizzaType bakePizza(PizzaType pizzaSelected){
        System.out.println("baking pizza " + pizzaSelected.toString());
        return pizzaSelected;
    }

    public static void confirmOrder(PizzaType pizzaSelected, String address){
        System.out.println("order sent to pizzeria --> " + pizzaSelected.toString() + " - " + address);
    }

    public static PizzaType preparePizza(PizzaType pizzaSelected){
        System.out.println("preparing pizza " + pizzaSelected.toString());
        return pizzaSelected;
    }

    public static void calmCustomer(){
        System.out.println("your pizza is coming!");
    }

    static PizzaType selectPizza(){

        Scanner reader = new Scanner(System.in);
        System.out.println("Select a pizza...");
        System.out.println("enter 1 - margerita");
        System.out.println("enter 2 - peperoni");
        System.out.println("enter 3 - jambon");

        int selection = reader.nextInt();

        switch (selection) {
            case 1:
                return PizzaType.Margherita;
            case 2:
                return PizzaType.Peperoni;
            case 3:
                return PizzaType.Jambon;
            default:
                return PizzaType.Margherita;
        }

    }

    public static PizzaType deliverPizza(PizzaType pizzaSelected, String address){
        System.out.println(pizzaSelected.toString() + "delivered at: " + address);
        return pizzaSelected;
    }

    public static void receivePizza(PizzaType pizzaSelected){
        System.out.println("received pizza " + pizzaSelected.toString());
    }

    public static void payPizza(){
        System.out.println("pizza payed 10$");
    }

    public static String selectAddress(){
        Scanner reader = new Scanner(System.in);
        System.out.println("What's your address?");
        String address = reader.nextLine();
        return  address;
    }

    public static void notifyPizzeria(){
        System.out.println("I'm waiting for my pizza! you are late!");
    }

    public static void receiveOrder(){
        System.out.println("order received");
    }


}
