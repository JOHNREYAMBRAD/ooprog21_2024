import java.util.Scanner;

public class CarlysCatering {

    public static void carlysEventPrice() {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("Carly's makes the food that makes it a party.");
        
        
        System.out.print("Enter the number of guests: ");
        int numberOfGuests = scanner.nextInt();
        
    
        final int pricePerPerson = 35;
        
        
        int totalPrice = numberOfGuests * pricePerPerson;
        
        
        System.out.println("Number of guests: " + numberOfGuests);
        System.out.println("Price per guest: $" + pricePerPerson);
        System.out.println("Total price: $" + totalPrice);
        
        
        boolean isLargeEvent = numberOfGuests >= 50;
        System.out.println("Is this a large event? " + isLargeEvent);
    }

    public static void main(String[] args) {
        carlysEventPrice();
    }
}