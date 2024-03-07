import java.util.Scanner;

public class character_case {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        char ch = s.next().charAt(0);

        if(ch >= 'A' && ch <= 'Z'){
            System.out.println("Character is between A and Z");
        } else if(ch >= 'a' && ch <='z'){
            System.out.println("Character is between a and z");
        } else {
            System.out.println("Character is number or special character");
        }
    }
}
