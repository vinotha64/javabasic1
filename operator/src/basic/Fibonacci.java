package basic;

public class Fibonacci {
	public void sum(int input1) {
		int a=0;
		int b=1;
		for(int i=2;i<=input1;i++) {
			int temp=a;
			a=a+b;
			b=temp;
		}
		System.out.println(a);
	}
	public static void main(String[] args) {
Fibonacci f1= new Fibonacci();
f1.sum(12);
	}

}
