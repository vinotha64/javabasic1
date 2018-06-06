package basic;

public class PoliceCar extends Car{
	public void brake() {
		System.out.println("car brake");
	}
	public static void main(String[] args) {
		Car car1=new Car();
		car1.brake();
		System.out.println("Policecar instanceof car");
	}

}
