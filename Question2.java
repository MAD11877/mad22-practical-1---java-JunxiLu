import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {

    Scanner in = new Scanner(System.in);
    System.out.println("Enter height in meters: ");
    double height = in.nextDouble();
    System.out.println("Enter weight in kilograms: ");
    double weight = in.nextDouble();
    double BMI = weight / (height * height);
    System.out.print("\nThe Body Mass Index (BMI) of the user is " + BMI );

  }
}
