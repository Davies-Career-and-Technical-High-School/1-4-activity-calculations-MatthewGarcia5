import java.util.Scanner;

class Lesson1_3 {
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);

    System.out.println("Input Inches");
    double x = scan.nextDouble();
    x /= 12;
    System.out.println("That is " + x + " feet.");
    

  }
}
