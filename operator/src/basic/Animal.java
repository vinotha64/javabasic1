package basic;

public abstract class Animal implements Travel,Owner {

}
class dog extends Animal{

	@Override
	public void getspeed() {
	}

	@Override
	public String getOwnerName() {

		return null;
	}
		
	}
class cat extends Animal{

	@Override
	public void getspeed() {
	}

	@Override
	public String getOwnerName() {
		
		return null;
	}
		
	}
class panda extends Animal{

	@Override
	public void getspeed() {
	}

	@Override
	public String getOwnerName() {
		
		return null;
	}
		
	}