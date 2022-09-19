public class Petrol {

public static void main(String[] args) {

PetrolPurchase purchase1 = new PetrolPurchase("Jakande", "Diesel", 5, 625.35, 5);

	System.out.printf("The location of purchase is: %s%n", purchase1.getLocation());

	System.out.printf("The type of petrol is: %s%n", purchase1.getPetrolType());

	System.out.printf("The quantity of purchase is %d liters. %n", purchase1.getQuantity());

	System.out.printf("The price per liter is %.2f%n", purchase1.getPrice());

	System.out.printf("The percentage discount given is: %.2f%n", purchase1.getDiscount());

	System.out.printf("The amount to be paid is: %.2f%n", purchase1.getPurchaseAmount());

	System.out.println("Thanks for patronising. Have a nice day!");




	}

}