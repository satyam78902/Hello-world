package ashi;

public class Hiding {
	public void M1() {
		System.out.println("sayan");
	}
   public static void M2() {
	   System.out.println("sayan");  	   
   }
}
   class H2 extends Hiding
   {
	   public void M1() {
			System.out.println("AGA");
		}
	   public static void M2() {
		   System.out.println("UAo"
		   		+ "");  	   
	   }   
   }

