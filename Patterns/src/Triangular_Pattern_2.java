import java.util.Scanner;

public class Triangular_Pattern_2 {
    public static void main(String args[]){
       Scanner s = new Scanner(System.in);
       System.out.println("Enter the number of row or column : ");
       int n = s.nextInt();
       
       int i = 1;
       int p = 1;
       while(i<=n){
        int j= 1;
        while(j<=i){
            System.out.print(p);
            p++;
            j++;
        }
        System.out.println();
        i++;
       }
    }
}
