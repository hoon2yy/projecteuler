package p1;

public class Euler6 {
	public static void main(String args[]){
		int sum1=0, sum2=0;
		for(int i=1;i<=100;i++){
			sum1 += i;
		}
		sum1 *= sum1;   // sum1 == (1+2+...+100)^2
		
		for (int i=1;i<=100;i++){
			sum2 += i*i;  // sum2 == (1^2 + 2^2 + ... + 100^2)
		}
		System.out.println(sum1-sum2);
	}
}
