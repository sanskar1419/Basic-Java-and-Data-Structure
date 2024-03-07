import java.util.Scanner;

public class Triangular_Pattern_6 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int i = 1 ;
         while(i<=n){
            int j=1;
            while(j<=i){
                System.out.print(i-j+1);
                j++;
            }
            i++;
            System.out.println();
         }
    }
}


/* 
 * Solution 1
 import java.util.Scanner;

public class Triangular_Pattern_6 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int i = 1 ;
         while(i<=n){
            int j=1;
            int p=i;
            while(j<=i){
                System.out.print(p);
                j++;
                p--;
            }
            i++;
            System.out.println();
         }
    }
}

 */