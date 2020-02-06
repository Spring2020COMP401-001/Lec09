package lec9.ex5;

public class JuggleApp {
	
	public static void main(String[] args) {
		Ball b1 = new Ball();
		Ball b2 = new Ball();
		Ball b3 = new Ball();
	
		Orange o1 = new Orange();
		Orange o2 = new Orange();
		
		juggle(b1, b2, b3);
		juggle(b1, o1, b3);
	}
	
	public static void juggle(Juggalable obj1, Juggalable obj2, Juggalable obj3) {
		
	}
	
 }
