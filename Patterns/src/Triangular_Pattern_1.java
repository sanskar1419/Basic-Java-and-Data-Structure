import java.util.Scanner;

public class Triangular_Pattern_1 {
  public static void main(String args[]){
    Scanner s = new Scanner(System.in);
    System.out.print("Enter the number of rows : ");
    int n = s.nextInt();

    int i =1;
    while(i<=n){
      int j = 1;
      while(j<=i){
        System.out.print(j);
        j++;
      }
      System.out.println();
      i++;
    }
  }
}