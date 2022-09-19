public class CarApplication {

public static void main(String[] args) {

	Car car1 = new Car("Honda", "2020", 4000000);
	Car car2 = new Car("Lexus", "2022", 7000000);

	System.out.printf("The price of the first car(car1) is %.2f%n", car1.getPrice());
	System.out.printf("The price of second car(car2) is %.2f%n", car2.getPrice());

	System.out.println();
	System.out.println("The first car has a 5% discount");
	System.out.println("The second car has a 7% discount");
	System.out.println();

	double price1 = car1.getPrice();

	double discount1 = 0.05 * price1;
	
	double newPrice1 = (price1 - discount1);
	car1.setPrice(newPrice1);


	double price2 = car2.getPrice();

	double discount2 = 0.07 * price2;

	double newPrice2 = (price2 - discount2);
	car2.setPrice(newPrice2);


	System.out.printf("The discounted price of the first car is: %.2f", car1.getPrice());
	System.out.println();

	System.out.printf("The discounted price of the second car is: %.2f", car2.getPrice());
	System.out.println();

	}

}