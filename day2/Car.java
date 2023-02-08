package week2.day2;

public class Car {

	public String getRegistrationNumber() {
		return "TN58 AA 0000";
	}
	private String getOwnerName() {
		return "Vivekanand";
	}
	void carModel() {
		System.out.println("Car Model: Jaguar");
	}
	public boolean isPunctured() {
		return false;
	}
	public int subtractTwoNumbers(int a, int b) {
		return a-b;
	}
	public int multiplyingThreeNumbers(int x, int y, int z) {
		return x*y*z;
	}
	public int divideTwoNumbers(int num1, int num2) {
		return num1/num2;
	}
	
	public static void main(String[] args) {
		
		Car c = new Car();
		String regNumber = c.getRegistrationNumber();
		System.out.println("car registration number: "+regNumber);
		String ownerName = c.getOwnerName();
		System.out.println("Car owner's name: "+ownerName);
		c.carModel();
		boolean isPunctured = c.isPunctured();
		System.out.println("Is punctured :"+isPunctured);
		int subTwoNumbers = c.subtractTwoNumbers(20, 10);
		System.out.println("Substraction :"+subTwoNumbers);
		int multiplyingThreeNumbers = c.multiplyingThreeNumbers(5,5,5);
		System.out.println("Multiplication :"+multiplyingThreeNumbers);
		int divideTwoNumbers = c.divideTwoNumbers(10,5);
		System.out.println("Division :"+divideTwoNumbers);
	}

}
