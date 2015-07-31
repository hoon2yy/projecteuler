package p1;

public class Euler3 {
	public static void main(String args[]){
		long n = (long)Math.sqrt(600851475143l);
		long i;
		for(i=n;;i--){
			if(600851475143l%i==0){
				if(isPrime(i)) break;
			}
		}
		System.out.println(i);
	}
	static boolean isPrime(long n){
		int i;
		for(i=2;i<n;i++){
			if (n%i==0) break;
		}
		if(n==i) return true;
		else return false;
	}
}
