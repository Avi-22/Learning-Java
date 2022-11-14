// Computes an approximation of PI.
public class CalcPi {

    public static void main(String args[]) { 
		int num = Integer.parseInt(args[0]);
		double sum = 1.0;
		double temp = 0;
		for (int i = 3; i <= num; i++){
			boolean prime = true;
			for (int j = 2; j <= i/2; j++)
				if (i%j ==0){
					prime = false;
					break;
				}
				if (prime){
					temp += (-1.0/i);
				}
		}
		sum = 1- temp;
		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated:     " + 4.0 * sum);
	}
}