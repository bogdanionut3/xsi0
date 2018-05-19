import java.util.Scanner;

public class Joc {
    public static void main(String[] args) {
        int table[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);
        boolean turn = true;
        boolean gameOver = false;//oprim jocul

        while (!gameOver) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (isValidInput(a, b)) {
                //schimba tura
                if (turn == true) {
                    table[a][b] = 1;
                    turn = false;
                    System.out.println("Este randul celui de-al doilea jucator ");
                } else {
                    table[a][b] = 2;
                    turn = true;
                    System.out.println("Este randul primului jucator ");
                }

            }
            afisareTablaJoc(table);
            switch (verificaJoc(table)) {
                case 0:
                    break;
                case 1:
                    System.out.println("A castigat x");
                    gameOver=true;
                    break;
                case 2:
                    System.out.println("A castigat y");
                    gameOver=true;
                    break;
                case 3:
                    System.out.println("remiza");
                    gameOver=true;
                    break;
            }
        }
    }

    public static boolean isValidInput(int a, int b) {
        if (a >= 0 && a <= 2 && b >= 0 && b <= 2) {
            return true;
        } else {
            return false;
        }
    }

    public static void afisareTablaJoc(int X[][]) {
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                if (X[i][j] == 0)
                    System.out.print("  _  ");
                else if (X[i][j] == 1)
                    System.out.print("   x   ");
                else if (X[i][j] == 2)
                    System.out.print("   y   ");
            }
            System.out.println(" ");
        }
    }

    public static int verificaJoc(int t[][]) {
        int i = 0;
        int j = 0;
        for (i = 0; i <= 2; i++)
            for (j = 0; j <= 2; j++) {
                if ((t[0][0] == t[0][1] && t[0][1] == t[0][2]) && (t[0][0] != 0 || t[0][1] != 0 || t[0][2] != 0)) {
                    return t[0][0];
                } else if
                        ((t[1][0] == t[1][1] && t[1][1] == t[1][2]) && (t[1][0] != 0 || t[1][1] != 0 || t[1][2] != 0)) {
                    return t[1][0];
                } else if
                        ((t[2][0] == t[2][1] && t[2][1] == t[2][2]) && (t[2][0] != 0 || t[2][1] != 0 || t[2][2] != 0)) {
                    return t[2][0];
                } else if
                        ((t[0][0] == t[1][0] && t[1][0] == t[2][0]) && (t[0][0] != 0 || t[1][0] != 0 || t[2][0] != 0)) {
                    return t[0][0];
                } else if
                        ((t[0][1] == t[1][1] && t[1][1] == t[2][1]) && (t[0][1] != 0 || t[1][1] != 0 || t[2][1] != 0)) {
                    return t[0][1];
                } else if
                        ((t[0][2] == t[1][2] && t[1][2] == t[2][2]) && (t[0][2] != 0 || t[1][2] != 0 || t[2][2] != 0)) {
                    return t[0][2];
                } else if
                        ((t[0][0] == t[1][1] && t[1][1] == t[2][2]) && (t[0][0] != 0 || t[1][1] != 0 || t[2][2] != 0)) {
                    return t[0][0];
                } else if
                        ((t[2][0] == t[1][1] && t[1][1] == t[0][2]) && (t[2][0] != 0 || t[1][1] != 0 || t[0][2] != 0)) {
                    return t[2][0];
                }
            }
        for (i = 0; i < 3; i++)
            for (j = 0; j < 3; j++) {
                if (t[i][j] == 0) {
                    return 0;
                }
            }
        return 3;
    }
}


