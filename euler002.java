package p1;

public class Euler2 {
	public static void main (String args[]){
		int sum=0;
		for(int num = 1;fibo(num)<=4e6;num++){
			if (fibo(num)%2==0) sum+=fibo(num);
		}
		System.out.println(sum);
	}
	
	static int fibo(int num){
		if (num==1)
			return 1;
		else if (num==2)
			return 2;
		else 
			return fibo(num-1)+fibo(num-2);
	}
}
