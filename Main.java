import java.util.Random;

public class Main
{
  public static void main(String[] args)
  {
    int count1, count2, count3, count4, count5, count6;
    count1 = count2 = count3 = count4 = count5 = count6 = 0;

    for(int i = 0; i < 100; i++) {
      int dice = roll();
      switch (dice) {
        case 1 -> count1++;
        case 2 -> count2++;
        case 3 -> count3++;
        case 4 -> count4++;
        case 5 -> count5++;
        case 6 -> count6++;
      }
      System.out.printf("Roll: [%d]%n", dice);
    }

    System.out.printf("Final roll counts:%n" +
            "[1]: %d times%n" +
            "[2]: %d times%n" +
            "[3]: %d times%n" +
            "[4]: %d times%n" +
            "[5]: %d times%n" +
            "[6]: %d times%n",
            count1, count2, count3, count4, count5, count6);
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