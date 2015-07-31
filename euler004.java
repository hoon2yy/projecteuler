package p1;

import java.util.ArrayList;

public class Euler4 {
	public static void main(String args[]){
		ArrayList<Integer> pellin = new ArrayList<Integer>();
		for(int x=100;x<1000;x++){
			for(int y=100;y<1000;y++){
				if(x*y/100000==x*y%10)
					if(x*y/10000%10==x*y%100/10)
						if(x*y/1000%100==x*y%1000/100) pellin.add(x*y);
			}
		}
		pellin.sort(null);
		System.out.println(pellin.get(pellin.size()-1));
	}
}
