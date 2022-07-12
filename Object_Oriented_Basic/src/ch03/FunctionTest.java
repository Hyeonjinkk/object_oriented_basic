package ch03;

public class FunctionTest {
	
	public static int addNum(int num1, int num2) 
	{
		
		int result;
		result = num1 + num2;
		
		return result;
	}	// end of addNum	
	
	public static void sayHello(String greeting) 
	{
		
		System.out.println(greeting);
		
	} // end of sayHello
	
	public static int calcSum() 
	{
		
		int sum = 0;
		int i;
		
		for (i=0; i<=100; i++) {
			sum += i;
		} // end of for in [calcSum]
		
		return sum;
	} // end of calcSum
	
	public static void main(String[] args) 
	{
		
		int n1 = 10;
		int n2 = 20;
		
		int total = addNum(n1, n2);
	
		System.out.println(total);
		
		sayHello("안녕하세요");
		
		total = calcSum();
		
		System.out.println(total);
		

	}	// end of main
}
