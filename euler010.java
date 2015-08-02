package p1;

public class Euler10 {
	public static void main(String args[]){
		long sum=0;
		for(int i=2;i<2000000;i++){
			if(isPrime(i)) sum+=i;
		}
		System.out.println(sum);
	}
	
	static boolean isPrime(int n){
		int i;
		for(i=2;i<=Math.sqrt(n);i++){
			if (n%i==0) return false;
		}
		return true;
	}
}
