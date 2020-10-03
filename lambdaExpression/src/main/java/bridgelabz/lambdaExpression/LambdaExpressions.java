package bridgelabz.lambdaExpression;

import java.util.function.Consumer;
import java.util.function.Predicate;

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
class CustomConsumer implements Consumer<Integer>{
	@Override
	public void accept(Integer t) {
			Predicate<Integer> evenNumber = (y) -> (y % 2 == 0);
			if (evenNumber.test(t))
				System.out.println("The double number through proper class " + t.doubleValue());
//		}
	}
}