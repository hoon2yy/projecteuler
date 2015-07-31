package p1;

public class Euler5 {
	public static void main(String args[]){
		int n;
		for(n=1;;n++){
			if(n%2==0&&n%3==0&&n%4==0&&n%5==0&&n%7==0&&n%8==0&&n%9==0)
				if(n%11==0&&n%13==0&&n%16==0&&n%17==0&&n%19==0){
					System.out.println(n);
					break;
				}
		}
	}
}
