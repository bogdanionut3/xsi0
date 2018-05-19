import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int table[][] = new int[3][3];
        int i, j;
        Scanner sc = new Scanner(System.in);
        for (i = 0; i <= 2; i++)
            for (j = 0; j <= 2; j++) {
                System.out.print("table[" + i + "][" + j + "]=");
                table[i][j] = sc.nextInt();
            }
        System.out.println("Matricea citita este: ");
        for (i = 0; i <= 2; i++) {
            for (j = 0; j <= 2; j++)
                System.out.print(" " + table[i][j]);
            System.out.println();
        }
    }
}
