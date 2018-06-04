package basic;

public class Multiple {
public boolean ismultiple(int one,int second)
{
	if(second%one==0)
		return true;
	else
		return false;
}
public boolean iseven(int second)
{
	if(second%2==0)
		return true;
	else
		return false;
}
public double celsius(double farenheit){
	double celsius= 5.0 / 9.0 * ( farenheit - 32 );
	return celsius;
}
public double farenheit(double celsius) {
	double farenheit=9.0 / 5.0 * celsius + 32;
	return farenheit;
}
		
public void isperfect(int n) {
	int sum=0;
	for(int i=1;i<=n/2; i++)
	{
		if(n%i==0)
		{
			sum=sum+i;
		}
	}	
	if(sum==n)
	
	System.out.println("is a perfectnumber");	
	else
		System.out.println("is not a perfectnumber" );
	}  
public void reverse() {
		int reversenumber=0,remainder,number=7631;
		while(number !=0)
		{
			remainder=number%10;
			reversenumber=remainder+(10*reversenumber);
			number /=10;
		
		}
		System.out.println("reversenumber"+reversenumber);
	} 

public static void main(String[] args) {
	Multiple m1= new Multiple();
  // m1.ismultiple(6,3);
   //m1.celsius(98);
   //m1.farenheit(108);
   //m1.isperfect(30); 
  
   
   //System.out.println(m1.farenheit(30.0));
   ///System.out.println(m1.celsius(98));
//System.out.println(m1.ismultiple(2,6));
System.out.println(m1.iseven(3));
m1.reverse();

}


}
