package basicCore;

public class PowerOf2 {

	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		if(n<31 && n>=0) {
			
			for(int i=0; i<=n; i++) {
				
				System.out.println(Math.pow(2,i));
				
			}
			
		}
		else
			System.out.println("Invalid Input");
	}
}
