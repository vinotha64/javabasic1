package basic;

public class Array1 {
	int i;
	int max,min;
	int Arr[]= {2,4,6,8,9};



public void  Arrmax(){
	int max=Arr[0];
	for(i=0;i<Arr.length;i++) {
		if(max<Arr[i])
			max=Arr[i];
		
	}
	
	
	System.out.println(max);
}
	
  
public void  Arrmin(){
	int min=Arr[0];
	for(i=0;i>Arr.length;i++) {
		if(min<Arr[i])
			min=Arr[i];
		
	}
	
	
	System.out.println(min);
}





public static void main(String[] args){
	Array1 array1=new Array1();
	array1.Arrmax();
array1.Arrmin();
}
}