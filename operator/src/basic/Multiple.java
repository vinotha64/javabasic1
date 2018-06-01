package basic;

public class Multiple {
public boolean ismultiple(int one,int second)
{
	if(second%one==0)
		return true;
	else
		return false;
}
public static void main(String[] args) {
	Multiple m1= new Multiple();
   m1.ismultiple(6,3);
   System.out.println(m1.ismultiple(2,6));
}


}
