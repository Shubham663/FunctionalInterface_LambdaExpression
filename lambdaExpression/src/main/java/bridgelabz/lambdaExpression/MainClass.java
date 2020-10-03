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
    	
    	List<Number> numbers = Arrays.asList(1,2d,3l,4l,5d);
    	CustomConsumer action = new CustomConsumer();
    	numbers.forEach(action);
    }
}

