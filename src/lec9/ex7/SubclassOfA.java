package lec9.ex7;

public class SubclassOfA extends ClassA {

	public SubclassOfA(int f1, int f2, int f3) {
		super(f1, f2, f3);
	}
	
	public void methodOfSubclass() {
		// System.out.println(private_field);
		System.out.println(protected_field);
		System.out.println(public_field);
		
		System.out.println(getPrivateField());
		aProtectedMethod();
	    // aPrivateMethod();   
	}
}
