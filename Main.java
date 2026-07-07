import java.util.Random;

class Main
{
  public static void main(String[] args)
  {
    // Example calling the roll() method
    System.out.println("Roll: " + roll());
  }
  
  // Random is a class we can use to generate random numbers
  // You do not need to change anything in the method below
  // Every time you invoke the roll() method, it will generate a random int
  // between 0-5, and then we add 1, so it will return a number between 1-6, just like dice
  public static int roll()
  {
    Random dice = new Random();
    return dice.nextInt(6) + 1;
  }
}