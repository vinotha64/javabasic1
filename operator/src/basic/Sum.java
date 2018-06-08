package basic;

public class Sum {
	static int getSum(int num) {
		int sum=0;
		while(num!=0) {
			int num1=num%10;
			sum=sum+num1;
			num=num/10;
		}
		return sum<10 ? sum:getSum(sum);
	}
	public static void main(String[] args) {
		
		
		System.out.println(getSum(279109));
	}
	}

