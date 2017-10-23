/** Dave Ciachin Exam #2 Program
 * The LucasNumbers program is designed to generate the first 30 numbers
 * in the Lucas Numbers sequence using recursion.
 * Exam #2Program
 * 
 * @author Dave Ciachin
 * @version 1.8
 * @since 2017-04-14
 */
//*Dave Ciachin LucasNumbers
package lucasnumbers;

public class LucasNumbers 
{
	/**Method using recursion to display
	 * the first 30 Lucas Numbers
	 * @param to initialize count at zero
	 * @param to begin while loop until
	 * the 30th number is reached
	 * @param to print the 30 lucas numbers
	 */
	public static void main (String[] args)
	{
		// 
		int count=0;
		
		while(count<=30)//while it is less than Lucas 30
		{
			System.out.println(lucas(count));
			count++;
		}
	}
	public static Integer lucas(int i)
	{
		/**Method to use recusion to return
		 * the first 30 Lucas numbers.
		 */
		if (i == 0) return 2;
		if (i == 1) return 1;
		Integer z = lucas(i - 1) + lucas(i - 2);
		if (i > 1) return z;
		return z;
	}
}
