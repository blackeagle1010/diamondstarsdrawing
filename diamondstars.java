import java.util.Scanner;

public class diamondstars {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println("enter line number:");
        int h = Input.nextInt();
        //firstpart is ascending
        int a = 1; //shape is adding as multiple (h count)
        while (a <= h) {
            for (int i = 1; i <= h; i++) {
                for (int j = 1; j <= h - i; j++)
                    System.out.print(" ");
                for (int j = 1; j <= (2 * i) - 1; j++)
                    System.out.print("*");
                System.out.println();
            }
            //semipart is descending
            for (int i = h; i >= 1; i--) {
                for (int j = 1; j <= h - i; j++)
                    System.out.print(" ");
                for (int j = 1; j <= 2 * i - 1; j++)
                    System.out.print("*");
                System.out.println();
            }System.out.print("");
            a++;
        }
    }
}