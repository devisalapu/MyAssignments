package week1.day2;

public class MyCalculator {

	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
		
		int res1 = calc.add(10, 20, 30);
		int res2 = calc.sub(20, 10);
		double res3 = calc.mul(10000, 100);
		float res4 = calc.div(10.5f, 2.5f);
		
		System.out.println("Sum value = " + res1);
		System.out.println("Substract = " + res2);
		System.out.println("Multiplication value = " + res3);
		System.out.println("Division value = " + res4);
	}

}
