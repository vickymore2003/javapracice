package abstractclass;

abstract class abstarctclass_ {
	// Rule: If there is any abstract method in a class, that class must be
	// abstract.
	// Rule: If you are extending any abstract class that have abstract method,
	// you must either provide the implementation of the method or make this class
	// abstract.
	// The abstract class can also be used to provide some implementation of the
	// interface.
	// In such case, the end user may not be forced to override all the methods of
	// the interface.

	public abstract void a();

	public void b() {
		System.out.println("b");
	}
}

public class abstarctclass extends abstarctclass_ {

	public static void main(String[] args) {

		abstarctclass a = new abstarctclass();

		a.b();
	}

	@Override
	public void a() {
		// TODO Auto-generated method stub
	}
}