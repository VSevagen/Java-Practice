public class Driver {
	private static final Object[] arr = {1,2.3,3.55,"String", 23.345677890,"sevagen","c",23}; //Random series of different datatype

	public static void main(String[] args) {
		Exceptional ex1 = new Exceptional();
		ex1.y(5);
		
		IFirst first = new InterfaceClass ();
		first.display();
		ISecond second = new InterfaceClass ();
		second.display();
		
		
		PrintGeneric generic = new PrintGeneric();
		generic.printAnyType(30.00);
		generic.printAnyArray(arr);
	}	
	
}
