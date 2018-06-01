package basic;

public class Array {  
	public static void main(String[] args) {
	int number=1234;
	 int t=number;
	int[] array=new int[10];
	int i=0;
	while(t>0)
	{
		int remainder=t%10;
		array[i]=remainder;
		i++;
				t=t/10;
	}
		for(i=0;i<array.length;i++)
		{
			
			System.out.println(array[i]);
	
		}
	}

}
