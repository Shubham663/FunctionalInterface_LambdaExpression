package bridgelabz.lambdaExpression;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import bridgelabz.lambdaExpression.MathFunctions;

/**
 * Hello world!
 *
 */
/**
 * @author Shubham, MainClass for controlling execution
 *
 */
public class MainClass 
{
    public static void main( String[] args )
    {
    	
    	List<Integer> numbers = Arrays.asList(2,2,3,4,5);
//    	CustomConsumer action = new CustomConsumer();
    	/**
    	 * printing list of numbers without consumer object
    	 */
    	numbers.forEach( System.out::println  );
    	LambdaExpressions lE = new LambdaExpressions();
    	lE.forEachDemo(numbers);
    }
    
}

