package basic;

public class AddDigits {
	public void add(int input1,int input2) {
		int sum;
		input1=input1%10;
		input2=input2%10;
		sum=input1+input2;
		System.out.println("sum"+sum);
	}
	public static void main(String[] args) {
		
		AddDigits a=new AddDigits();
		a.add(27,9);
	}
	

}
