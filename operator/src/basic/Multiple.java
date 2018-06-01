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
		

public static void main(String[] args) {
	Multiple m1= new Multiple();
   m1.ismultiple(6,3);
   m1.celsius(98);
   m1.farenheit(108);
   System.out.println(m1.farenheit(108));
   System.out.println(m1.celsius(98));
System.out.println(m1.ismultiple(2,6));
System.out.println(m1.iseven(3));
}


}
