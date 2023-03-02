package studio5;

import edu.princeton.cs.introcs.StdDraw;

/**
 * 
 * @author jaychitalia
 *
 */
public class Methods {

	/**
	 * Compute the (Euclidean) distance between two points.
	 *
	 * @param x1 x-coordinate of a point
	 * @param y1 y-coordinate of a point
	 * @param x2 x-coordinate of another point
	 * @param y2 y-coordinate of another point
	 * @return the Euclidean distance between (x1,y1) and (x2,y2)
	 */
	public static double distanceBetween(double x1, double y1, double x2, double y2) {
		double distance = 0;
		// FIXME: Hint use Math methods (e.g. Math.sqrt) to compute the distance
		double distancex = (x2 - x1)*(x2 - x1);
		double distancey = (y2 - y1)*(y2 - y1);
		distance = Math.sqrt(distancex + distancey);
		return distance;
	}

	/**
	 * Draw a bull's eye at the given location with the given radius.
	 *
	 * @param x      the x coordinate of the center of the bull's eye
	 * @param y      the y coordinate of the center of the bull's eye
	 * @param radius the radius of the bull's eye
	 */
	public static void drawBullsEye(double x, double y, double radius) {
		ring(x,y,radius,0,0,0);
		ring(x,y,3.0/4.0*radius,0, 109, 219);
		ring(x,y,1.0/2.0*radius,146, 0, 0);
		ring(x,y,1.0/4.0*radius,255, 255, 109);

	}
	/**
	 * Return the mean of an array with already provided values
	 * 
	 * @param x 	coordinate
	 * @param y 	coordinate
	 * @param radius 	value
	 * @param r		red value
	 * @param b		blue value
	 * @param g		green value
	 */
	public static void ring(double x, double y, double radius, int r, int b, int g) {
		StdDraw.setPenColor(r, b, g);
		StdDraw.filledCircle(x, y, radius);
	}
		
		// TODO: Draw the remaining rings of the bull's eye
		// Blue ring with 3.0/4.0 the radius
		// suggested rgb values: 0, 109, 219

		

		// Red ring with 1.0/2.0 the radius
		// suggested rgb values: 146, 0, 0

		

		// Yellow ring with 1.0/4.0 the radius
		// suggested rgb values: 255, 255, 109

		


	/**
	 * Return a new String which is the original source String with all occurrences
	 * of the target character substituted by the replacement String.
	 * 
	 * @param source      the source String
	 * @param target      the target character to be replaced
	 * @param replacement the replacement String
	 * 
	 * @return the String which results from substituting all of the target
	 *         characters in the source String with the replacement String
	 */
	public static String substituteAll(String source, char target, String replacement) {
		String result = "";
		// TODO: Finish this method
		for (int i = 0; i < source.length(); ++i) {
			char ch = source.charAt(i);
			if (ch == target) {
				result = result + replacement;
			} else {
				result = result + ch;
			}
		}
		return result;
	}

	/**
	 * Compute the sum of elements in an array
	 * 
	 * @param values an array of integers
	 * @return the sum of the elements in values
	 */
	public static int arraySum(int[] values) {
		int sum = 0;
		// FIXME: Compute the sum of the values in an array
		for (int i = 0; i <= values.length - 1; i++) {
			sum = sum + values[i];
		}
		return sum;
	}

	/**
	 * Return an array of a given size filled with the provided value
	 * 
	 * @param length the length of the returned array
	 * @param value  the value to fill the array with
	 * @return and array of size that's filled with value
	 */
	public static int[] filledArray(int length, int value) {
		int[] values = new int[length]; // FIXME: Create an array of the appropriate size
		// TODO: Finish this method
		for (int i = 0; i <= length - 1; i++) {
			values[i] = value;
		}
		

		return values;
	}
	/**
	 * Return the mean of an array with already provided values
	 * 
	 * @param array 	the integer array given
	 * @return mean
	 */
	// TODO: Create an arrayMean method which accepts an int array of values parameter.
		public static double arrayMean(int [] array) {
			return arraySum(array) / (double) array.length;
		}
	
	// TODO: Create a JavaDoc comment for the arrayMean method.

	
}
