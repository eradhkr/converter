import java.util.Scanner;

public class Main {
  public static void main(String[] args) 
  {

    Scanner reader = new Scanner(System.in);
    int conversion = 1;
    while (conversion > 0 && conversion <= 5) {

      System.out.println("What operation do you want to do?");
      System.out.println("1 for yard to ft");
      System.out.println("2 for miles to km ");
      System.out.println("3 for feet to inches");
      System.out.println("4 for cup to ounces");
      System.out.println("5 for pound to ounces");
      System.out.println("6 for pint to quart");
      System.out.println("7 for cup to mL");
      System.out.println("8 for quart to ounces");
      System.out.println("9 for inches to cm");
      System.out.println("10 for gallon to liters");

      conversion = reader.nextInt();
      if (conversion > 10 || conversion <= 0) {
        System.out.println("Invalid input. Please try again.");
        break;
      }
      System.out.println("Enter a number: ");
      double firstNumber = reader.nextDouble();

      switch (conversion) {
        case 1:
          System.out.println("Your answer is " + Convertor.ydToft(firstNumber) + " feet");
          break;

        case 2:
          System.out.println("Your answer is about " + Convertor.miTokm(firstNumber) + " kilometers");
          break;

        case 3:
          System.out.println("Your answer is " + Convertor.ftToin(firstNumber) + " in");
          break;

        case 4:

          System.out.println("Your answer is " + Convertor.cupTooz(firstNumber) + " ounces");
          break;

        case 5:

          System.out.println("Your answer is " + Convertor.pdTooz(firstNumber) + " ounces");
          break;

        case 6:

          System.out.println("Your answer is " + Convertor.ptToQu(firstNumber) + " quart");
          break;

        case 7:
          System.out.println("Your answer is " + Convertor.cpTomL(firstNumber) + " milileters");
          break;

        case 8:
          System.out.println("Your answer is " + Convertor.qtToOz(firstNumber) + " ounces");
          break;

        case 9:
          System.out.println("Your answer is " + Convertor.inToCm(firstNumber) + " centimeters");

          break;

        case 10:
          System.out.println("Your answer is about " + Convertor.galToLi(firstNumber) + " liters");
          break;

        case 11:

        default:

          System.out.println("Invalid input. Please try again.");
          break;

      }

    }
    reader.close();

  }

}