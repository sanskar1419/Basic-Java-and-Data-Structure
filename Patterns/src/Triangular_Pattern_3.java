import java.util.Scanner;

public class Triangular_Pattern_3 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of row : ");
        int n = s.nextInt();

        int i = 1;
        while(i<=n){
            int j = 1;
            int p = i;
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
