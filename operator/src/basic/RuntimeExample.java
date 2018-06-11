package basic;

import java.io.IOException;

public class RuntimeExample {
	public static void main(String[] args) {
		long start=System.currentTimeMillis();
		long startnano=System.nanoTime();
		Runtime runtime=Runtime.getRuntime();
		runtime.addShutdownHook(new Thread() {
		public void run() {
			System.out.println("JVM is shutting down");
		}
		});

			
		

	
		int pro=runtime.availableProcessors();
		 System.out.println(pro);
		long end=System.currentTimeMillis();
		long endnano=System.nanoTime();
		System.out.println(end-start);
		 System.out.println(endnano-startnano);
		System.out.println(System.getenv());
		
		int one[]= {12,3,4,5};
		int two[]=new int[one.length];
		
		for(int i=0;i<one.length;i++) {
			two[i]=one[i];
			System.arraycopy(one, 0, two, 0,one.length);
			
		 // try {
		//Process process = runtime.exec("notepad");
			//process.waitFor();
		//} catch (Exception e) {
			///e.printStackTrace();
		}

		}

	

}
