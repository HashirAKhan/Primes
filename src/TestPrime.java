
public class TestPrime {

	public static void main(String[] args) {
		 boolean result = Primes.isPrime(51);
		 System.out.println("51 : " + result);
		 
		 int[] firstTenPrimes = Primes.firstNPrimes(10);
		 
		 Primes.printArr(firstTenPrimes);
	}

}
