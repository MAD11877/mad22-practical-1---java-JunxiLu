import java.util.Scanner;
import java.util.ArrayList;
public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    int total = in.nextInt();
    ArrayList <Integer> numbers = new ArrayList <Integer>();
    for (int x = 0; x < total; x++)
        {
          int y = in.nextInt();
          numbers.add(y);
    } 

    int maxNumber = -1;
    int maxApperances = -1;

    for (int i = 0; i < total; i++) {

      int count = 0;

      for (int j = 0; j < total; j++) {

        if (numbers.get(i) == numbers.get(j))
          count++;

      }
      
      if (count > maxApperances)
        maxNumber = numbers.get(i);
        maxApperances = count;
    }
    
    System.out.println(maxNumber);
    in.close();
      
  }
}
