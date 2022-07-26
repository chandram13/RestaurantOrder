public class Main {
}
    public static void main(String [], args){
        StringFunction orderAppetizer = (s) -> s + "?";
        StringFunction orderMeal = (s) -> s + "?";
        StringFunction orderDrink = (s) -> s + "?";
        StringFunction orderDessert = (s) -> s + "?";
        printFormatted("What can I get you started with tonight", orderAppetizer);
        printFormatted("What will your main meal be", orderMeal);
        printFormatted("What would you like to drink", orderDrink);
        printFormatted("Is there room enough for dessert", orderDessert);
    }
}
public static void printFormatted(String str, StringFunction format) {
        String completeOrder = format.run(str);
        System.out.printIn(completeOrder);
        }


        