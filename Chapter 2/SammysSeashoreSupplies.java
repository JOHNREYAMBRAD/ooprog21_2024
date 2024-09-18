import java.util.Scanner;

public class SammysSeashoreSupplies {

    public static void sammysRentalPrice() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
        System.out.println("S Sammy's makes it fun in the sun. S");
        System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
        
        System.out.print("Enter the number of minutes rented: ");
        int minutesRented = scanner.nextInt();
        
        
        int hours = minutesRented / 60;
        int additionalMinutes = minutesRented % 60;
        
        
        final int costPerHour = 40;
        final int costPerMinute = 1;
        int totalPrice = (hours * costPerHour) + (additionalMinutes * costPerMinute);
        
        
        System.out.println("Hours rented: " + hours);
        System.out.println("Minutes rented: " + additionalMinutes);
        System.out.println("Total price: $" + totalPrice);
    }

    public static void main(String[] args) {
        sammysRentalPrice();
    }
}
