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
    	
    	List<Integer> numbers = Arrays.asList(1,2,3,4,5);
    	
    	/**
    	 * Printing through proper class
    	 */
    	CustomConsumer action = new CustomConsumer();
    	numbers.forEach(action);
    	
    	
    	/**
    	 * Printing through Anonymous class creation
    	 */
    	numbers.forEach(new Consumer<Integer>() {
    		@Override
    		public void accept(Integer t) {
    			System.out.println("The number through anonymous class " + t );
    		};
		});
    	
    	
    	/**
    	 * Printing using lambda function
    	 */
    	Consumer<Integer> consumerObj = t -> {System.out.println("The number through "
    										+ "lambda function " + t);
    										 };
    	numbers.forEach(consumerObj);
    }
}

