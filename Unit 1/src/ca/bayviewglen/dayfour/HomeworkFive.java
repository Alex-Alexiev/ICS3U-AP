package ca.bayviewglen.dayfour;

public class HomeworkFive {

	public static void main(String[] args) {
		
		double x = 5.5, y = 3.0;
		int i = 5, j = 4, k = 3;
		
		double a = x-y, b = y-x, c = x/k, d = (double)i/j;
		int l = i-j, n = i+j;
			
		System.out.println(j);
		System.out.println(a*(x+l));
		System.out.println(-2*b);
		System.out.println(2*a-2*b);
		System.out.println(n-k*i/j);
		System.out.println(i*j/k+l);
		System.out.println((i*i-k*k)/(n*l));
		System.out.println((double)i+j/k);
		System.out.println((int)c-c);
		System.out.println(d-i/j);
		
		System.out.println();          
				
		System.out.println(i-(i- (i- (i-j))));
		System.out.println((x-y) * (x+ (i-j)));
		System.out.println((x-y) - (y-x) - (x-y) - (y-x));
		System.out.println((x-y) - ((y-x) - ((x-y) - (y-x))));
		System.out.println(i + j - k * i / j);
		System.out.println(i * j / k + i - j);
		System.out.println(((i + k) * (i - k)) / ((i + j) * (i - j)));
		System.out.println((double) i + j / k);
		System.out.println((int) x / k - x / k);
		System.out.println((double) i / j - (double) (i / j));
		
		/*
		Output
		4
		16.25
		5.0
		10.0
		6
		7
		1
		6.0
		-0.8333333333333333
		0.25
		*/
		
		
		
		
	}

}
