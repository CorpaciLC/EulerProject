// Problem 10
public class sumationOfPrimes {
	public boolean checkPrime(double n) {
		if(n == 2 || n == 3) return true;
		for(int i = 2; i <= n/2; i++) {
			if(n % i == 0) 	return false;
		} 
		return true;
	}
	public long sumOfPrimes(long lim) {
		long sum = 2;
		for(long i = 3; i < lim; i = i + 2) {
			if(this.checkPrime(i)) {
				System.out.println(i);
				sum+=i;
			}
			//System.out.println(sum);
		}
		return sum;
	}
	public static void main(String args[]) {
		sumationOfPrimes obj = new sumationOfPrimes();
		System.out.println(obj.sumOfPrimes(2000000));
	}
}
