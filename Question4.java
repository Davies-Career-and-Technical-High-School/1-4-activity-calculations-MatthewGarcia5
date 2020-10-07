import java.util.Scanner;

class Lesson1_3 {
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);

    System.out.println("Enter A Price");
    double x = scan.nextDouble();
    double change = 20 - x; 
    System.out.println("Change From $20: $" + change);
    

  }
}
