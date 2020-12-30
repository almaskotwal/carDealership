package car_dealership;

public class Dealership {

	public static void main(String[] args) {
		
		Customer cust1 = new Customer("Tom", "223 SomeAddress St.", 12000 );
		Vehicle vehicle = new Vehicle("Honda", "Accord", 10000);
		Employee emp = new Employee();
		cust1.purchaseCar(vehicle, emp, false);
	}

}
