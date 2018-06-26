package javabasics;
import java.lang.*;

public class Duplicate {
  public static void  main(String args[]) {
    int count=0;
    String str= "Bread Butter and Bread";
      
    String[] a=str.split("");
    for(int i=0;i<a.length;i++) {
    
      for(int j=0;j<a.length;j++) {
        if(a[i].equalsIgnoreCase(a[j])){

        count++;
        }
      }
    }
        System.out.println(count);
        
}
}