package basic;

public class Polytest {
	public static void main(String[] args) {
		
		
		
		Polytest pt=new Polytest();
		Sportscar sc=new Sportscar();
		Policecar pc=new Policecar();
		Taxi taxi=new Taxi();
		pt.brake(sc);
		pt.brake(pc);
		pt.brake(taxi);
	
    Car car[]= {new Policecar(),new Sportscar(),new Taxi()};
	for(int i=0;i<car.length;i++){
		car[i].brake();
	}
	}
    
	
	
	
	public void brake(Car car){
car.brake();

}
}

