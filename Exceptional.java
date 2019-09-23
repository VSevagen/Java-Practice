
public class Exceptional {
	
	public void x() {
	throw new IndexOutOfBoundsException();
	}
	
	public void y(int n) {
	try
	{
		if(n > 10) {
			x();
		}
		else {
			z();
		}
	}
	
	catch(IndexOutOfBoundsException e) {
	System.out.println("index out of bounds caught in y");
	}
	catch(Exception e) {
	System.out.println("exception caught in y");
	}
	}
	public void z() {
	throw new NullPointerException();
	}
}

