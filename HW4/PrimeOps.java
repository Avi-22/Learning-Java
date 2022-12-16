public class PrimeOps {
	public static void main(String args[]) {

	}

	public static int[] sieve(int num) {
		num += 1;
		int count = 0;
		boolean[] prime = new boolean[num];
		for (int i = 2; i < num; i++) {
			prime[i] = true;
		}
		for (int i = 2; i < num; i++) {
			for (int j = 2; j < num; j++) {
				if (j % i == 0 && j != i) {
					prime[j] = false;
				}
			}
			if (!prime[i])
				count++;
		}

		count = num - count - 2;
		int prime_arr[] = new int[count];
		for (int i = 0, z = 0; i < num; i++) {
			if (prime[i]) {
				prime_arr[z] = i;
				z++;

			}
		}
		return prime_arr;
	}

	public static void printArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
