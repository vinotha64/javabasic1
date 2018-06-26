package basic;

public class Frequency {


private int[] findfrequency(int num, int[] arr) {
	
int numcopy=num;
int r=0;
while(numcopy!=0) {
	r=numcopy%10;
	arr[r]=arr[r]+1;
	numcopy=numcopy/10;
}
printArray(arr);
	return arr;
}

public void max(int i1,int i2,int i3,int i4) {

	int arr[]=new int[10];
arr=findfrequency(i1,arr);
arr=findfrequency(i2,arr);
arr=findfrequency(i3,arr);
arr=findfrequency(i4,arr);
printArray(arr);
}
public void printArray(int arr[]) {
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
	}
}
public static void main(String[] args) {
	Frequency f1=new Frequency();
	f1.max(144,567,678,789);
}
}