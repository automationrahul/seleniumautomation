package Day3;

public class operatordemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// arithmatic operator +-/*%
		int a=10, b = 20;
		System.out.println("Sum of a + B  " + (a+b));
		System.out.println("Sum of a - B  " + (a-b));
		System.out.println("Sum of a * B  " + (a*b));
		System.out.println("Sum of a / B  " + (a/b));
		System.out.println("Sum of a % B  " + (a%b));
		//relational operator <, <=,>,>= !=
		System.out.println("Sum of a < B  " + (a<b));
		System.out.println("Sum of a <= B  " + (a<=b));
		System.out.println("Sum of a > B  " + (a>=b));
		System.out.println("Sum of a >= B  " + (a>b));
		System.out.println("Sum of a != B  " + (a!=b));
		
		boolean x= true;
		boolean y= false;
		System.out.println(x && y);
		System.out.println(x || y);
		System.out.println(!y);
		
       // ++ is called incremental operator
		int inc=10;
		System.out.println(inc);
		inc=inc+1;
		System.out.println(inc);
		inc++;
		System.out.println(inc);
		
		// var= exp ? result1 : result2;
		//example1
		int var1=100, var2=200;
		int result = (var1>var2) ? var1:var2; 
		System.out.println(result);

	}

}
