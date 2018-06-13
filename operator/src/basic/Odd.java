package basic;

public class Odd {
	public void getoddnumber() {
		int arr[]= {12,16,9,15,0};
		int count=0,i;
		for(i=0;i<arr.length;i++) {
			if(i%2==0)
			{
				count++;
			}
			System.out.println(count);
		}
		}
		public static void main(String[] args) {
		Odd o1=new Odd();
	o1.getoddnumber();
		
	}

}
