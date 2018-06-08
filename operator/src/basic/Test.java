package basic;

public class Test {
	public static void main(String[] args) {
	Travel travel1=new bus();
	Travel travel2=new dog();
	System.out.println("travel1 instanceof bus");
	System.out.println("travel2 instanceof dog");
	Travel travel3=new panda();
	Owner owner=(panda)travel3;
	}

}
