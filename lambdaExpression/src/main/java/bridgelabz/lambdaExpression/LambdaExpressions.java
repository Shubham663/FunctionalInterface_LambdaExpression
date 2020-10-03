package bridgelabz.lambdaExpression;

import java.util.function.Consumer;

/**
 * Hello world!
 *
 */

interface MathFunctions{
	int calculate(int a,int b);
	public static void printExpression(int a,int b, String methodName, MathFunctions function) {
		System.out.println("The " + methodName + " of the numbers"
				+ a + " & " + b + " is given by " + function.calculate(a, b));
	}
}
public class LambdaExpressions 
{
	
}

/**
 * @author Shubham, CustomConsumer class for passing instance 
 * 					as i/p to forEach for iteration
 *
 */
class CustomConsumer implements Consumer<Number>{
	@Override
	public void accept(Number t) {
			System.out.println("The double number through proper class " + t.doubleValue());
		
	}
}