package day8;

public interface Car extends RTO{
	
	// ByDefault it is abstract
	public void colour() ;
	abstract void model();
	void rooftop();
	
	// default method from 1.8 java onwards
	
	default void defMethod() {
		System.out.println("Default methods");
	}

}
