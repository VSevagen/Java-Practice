public class PrintGeneric {
	public static <T> void printAnyType(T x) {
	      System.out.println("I am a variable of " + x.getClass());
	      System.out.println("The parent of my " + x.getClass().getGenericSuperclass());
	      System.out.println(x);
	      System.out.println();
	    }
	 public static <T> void printAnyArray(T arr[]) {
		 for(int i=0;i<arr.length;i++) {
			 System.out.println(arr[i]);
			 System.out.println("I am a variable of " + arr[i].getClass());
			 
		 }
	 }
}
