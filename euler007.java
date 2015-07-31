package p1;

public class Euler7 {
	public static void main(String args[]){
		int n=1;
		int count=0;
		while(true){
			if(isPrime(n)) {
				count++;
			}
			if(count==10001) {
				System.out.println(n);
				break;
			}
			n++;
		}
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
