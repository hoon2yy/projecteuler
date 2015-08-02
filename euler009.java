package p1;

public class Euler9 {
	public static void main(String args[]){
		int a,b,c;
		for (a=1;a<=1000;a++){
			for(b=a;b<=1000;b++){
				for(c=b;c<=1000;c++){
					if(a+b+c==1000&&Math.pow(a, 2)+Math.pow(b, 2)==Math.pow(c, 2))
						System.out.println(a*b*c);
				}
			}
		}
	}
}
