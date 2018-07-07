public class Primes {
	public static boolean isPrime(int number) {
		if (number < 2) {
			return false;
		}		
		
		if (number == 2) {
			return true;
		}
		
		if (number % 2 == 0) {
			return false;
		}		
		
		int divisor = 3;
		
		while (divisor < number) {
			 if (number % divisor == 0) {
				 return false;
			 }
			 
			 divisor += 2;
		}
		
		return true;		
	}
	
	public static boolean isPrimeImproved(int number) {
		if (number < 2) {
			return false;
		}		
		
		if (number == 2) {
			return true;
		}
		
		if (number % 2 == 0) {
			return false;
		}		
		
		int divisor = 3;
		
		while (divisor < number) {
			 if (number % divisor == 0) {
				 return false;
			 }
			 
			 divisor += 2;
		}
		
		return true;		
	}
	
	public static int factorial(int number){
		int product = 1;
		
		for (int i = number; i > 0; i--){
			product *= i;
		}
		
		return product;	
	}
	
	public static int[] firstNPrimes(int n) {
		int[] primes = new int[n];
		
//		for (int i = 0; i < primes.length; i++){
//			
//		}
		
		int count = 0;
		int value = 2;
		
		while (count < n) {
			if (isPrimeImproved(value)){
				primes[count] = value;
				count++;
			}
			
			value++;
		}
		
		return primes;
	}
	
	public static void printArr(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
			
			if (i != array.length - 1) {
				System.out.print(", ");
			}
		}
		
		System.out.println();
	}
}