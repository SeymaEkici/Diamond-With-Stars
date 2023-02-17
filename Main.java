import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        int set = input.nextInt();

        for (int i = 0; i <= set; i++) {
            for (int j = 0; j < (set - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2*i+1; k++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for (int i = set; i >= 0; i--) {
            for (int j = 0; j < (set - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2*i+1; k++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
