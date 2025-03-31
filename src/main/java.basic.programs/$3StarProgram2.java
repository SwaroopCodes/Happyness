import java.util.Scanner;

public class $3StarProgram2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows = sc.nextInt();

        print$2Star(rows);
    }

    private static void print$2Star(int x) {
        for (int i = 0; i < x; i++) {
            for (int j = i; j < x; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
