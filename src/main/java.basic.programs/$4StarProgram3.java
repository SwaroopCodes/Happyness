import java.util.Scanner;

public class $4StarProgram3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows = sc.nextInt();

        print$3Star(rows);
    }

    private static void print$3Star(int x) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k < x; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
