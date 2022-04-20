import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {

    int x,y,rows;
    Scanner in = new Scanner(System.in);
    rows = in.nextInt();

    for (x=rows;x>0;x--)
        {
            for(y=0;y<x;y++)
            {
              System.out.print("*");
            }
            System.out.println("");
    }

    
  }
}
