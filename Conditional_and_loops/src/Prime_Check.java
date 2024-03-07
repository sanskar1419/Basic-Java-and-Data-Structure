import java.util.Scanner;
import java.lang.Math;

public class Prime_Check {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int i = 2;
        while(i<= num/2){
           if(num%i == 0){
            System.out.println(num + " is not a prime number");
            return;
           }
           i++;
        }
       System.out.println(num + " is a prime number");
    }
}
