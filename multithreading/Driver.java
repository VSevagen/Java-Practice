
public class Driver {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		Multi thread1 = new Multi ();
		Multi1 thread2 = new Multi1 (); 
		
		for(int i =1; i<=5; i++) {
			for(int k = 1;k<=i;k++) {
				if(k%2!=0) {
					thread1.start();
					Thread newline = new Thread();
					newline.start();
					thread1 = new Multi ();
				}
				
				else {
					thread2.start();
					Thread newline = new Thread();
					newline.start();
					thread2 = new Multi1 ();
				}
			
			}
			System.out.print("\n");
		}
		
	}
}
