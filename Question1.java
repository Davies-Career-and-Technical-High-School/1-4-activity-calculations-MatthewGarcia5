import java.util.Scanner;

class Lesson1_3 {
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);

    System.out.println("Choose an Integer");
    int x = scan.nextInt();

    for(int i = x; i < x + 4; i++) {
      System.out.println("The number is now " + i);
    }

  }
}
