import java.util.Scanner;

class Lesson1_3 {
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);

    System.out.println("Input The Radius");
    double x = scan.nextDouble();
    double circ = (2 * 3.14) * x;
    double area = (x * x) * 3.14;
    System.out.println("Circumference: " + circ);
    System.out.println("Area: " + area);
    

  }
}
