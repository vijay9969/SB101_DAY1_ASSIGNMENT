//Question 4: Explain Generic in Java and Its Importance with example
//this concept is also introduced in java 1.5v.
//the main objective of Generic is to achieve type-safety.
//It makes the code stable by detecting the bugs at compile time.
//Generic concept mostly used with collection f/w related classes, but we can 
//apply the generic concept without collection f/w also.
package day1.Q4;

public class Main {
	
	
	public static void main(String[] args) {
		
		
		Generic<Integer> inte = new Generic<>(10);
		
		System.out.println(inte);
		
		Generic<String> Stri = new Generic<>("Hello");
		
		System.out.println(Stri);
	}

}
