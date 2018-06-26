package basic;

	
	 public class MaxNo{
	     public static int i;
	public static void main(String args[]){
	 
	        int arr[]={-5, -34, -78, -2, -45, -1, -99, -23};
		    int a=-1;
		    int b=-2;
	            
	       {
		    for(int i=0;i<arr.length;i++){
		        if(a<arr[i]){
			    b=a;
				a=arr[i];
				}

			}
			System.out.println(a+ "and" +b);
			
		}
	 
	  }
	}
	    
		

