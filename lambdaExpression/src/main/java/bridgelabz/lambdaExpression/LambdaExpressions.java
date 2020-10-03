package bridgelabz.lambdaExpression;

/**
 * Hello world!
 *
 */
public class LambdaExpressions 
{
	interface MathFunctions{
		int calculate(int a,int b);
		public static void printExpression(int a,int b, String methodName, MathFunctions function) {
			System.out.println("The " + methodName + " of the numbers"
					+ a + " & " + b + " is given by " + function.calculate(a, b));
		}
	}
}
