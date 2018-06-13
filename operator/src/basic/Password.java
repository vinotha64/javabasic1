package basic;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;
public class Password {
	public static void main(String[] args) 
	{
		int n;
		System.out.println("enter no of elements");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		ArrayList<Integer> arr=new ArrayList<Integer>();
		for(int p=0;p<n;p++)
		{
		arr.add(sc.nextInt());	
		}
		for (int i = 0; i <n; i++) {
			//System.out.println(arr);
			int a=arr.get(i);
			int a1=a;
			//System.out.print(a+" ");	
	
		
		int count[]=new int[100];
		int sort[]=new int[100];
		int remainder,temp,k=0;
	
			while(a1!=0) {
				remainder=a1%10;
				count[remainder]=count[remainder]+1;
				a1=a/10;
			}
			for (; k<count.length-1; k++) {
	            if (count[k] < count[k+ 1]) {
	                temp = count[k];
	                count[k] = count[k + 1];
	                count[k + 1] = temp;
	                sort [k]= count[k];
	              
	                }
			}
			for(int v=0;v<sort.length-1;v++)
			{
				if((sort[0]==sort[v+1])&&(sort[v]!=0))
					System.out.println(a);
				
			} 
			}       
	}
			
			
	}
//		
//	
//	
//	
//		Password3 password=new Password3();
//		password.findPassword();
//		System.out.println(password);



