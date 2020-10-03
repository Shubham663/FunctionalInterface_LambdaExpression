package bridgelabz.lambdaExpression;

import bridgelabz.lambdaExpression.LambdaExpressions.MathFunctions;

/**
 * Hello world!
 *
 */
public class MainClass 
{
    public static void main( String[] args )
    {
    	MathFunctions add = (x,y) -> (x+y);
    	MathFunctions subtract = (x,y) -> (x-y);
    	MathFunctions multiply = (x,y) -> (x*y);
    	
    	MathFunctions.printExpression(10, 20, "Addition", add);
    	MathFunctions.printExpression(10, 20, "Subtraction", subtract);
    	MathFunctions.printExpression(10, 20, "Multiplication", multiply);
    }
}
