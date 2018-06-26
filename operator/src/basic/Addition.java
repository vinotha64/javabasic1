package basic;


public class Addition {

		
	
	public void add(int input1,int input2,int input3,int input4) {
		int sum=0;
		int arr[]= {input1,input2,input3};
	
			int a[]=new int[3];
			int b[]=new int[3];
			int c[]=new int[3];
			for(int i=0;i<arr.length;i++) {
				a[i]=arr[i]%10;
				
				sum=arr[0]+arr[1]+arr[2];
		}
			for(int j=0;j<arr.length;j++){
				b[j]=(arr[j]/10)%10;
				
				sum=arr[0]+arr[1]+arr[2];
			}
				
			for(int k=0;k<=arr.length;k++) {
				c[k]=arr[k]/100;
				
				sum=arr[0]+arr[1]+arr[2];
			}
			
			if(input4==0) {
			
				System.out.println(sum);
			}
			if(input4==1) {
				System.out.println(sum);
			}
			if(input4==2) {
				System.out.println(sum);
			}
	}
	
		public static void main(String[] args) {
			Addition a1=new Addition();
			a1.add(123,456,789,0);
			//System.out.println(a1);
		}


	
		
	}
	


