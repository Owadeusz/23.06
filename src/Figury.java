

public class Figury {
    public static void main(String[] args) {
        fig1(10);
        System.out.println(" ");
        fig2(10);
        System.out.println(" ");
        fig3(10, 15);
    }

    static void fig1(int n) {

        for (int i = 1; i <= n; i++) {
            System.out.println("*");
            if (i == n) {
                break;
            }
            for (int j = 1; j <= i + 1; j++) {
                if (j != i) {
                    System.out.print("*");
                }
            }
        }
    }

    static void fig2(int n) {

        for (int i = 1; i <= n + 1; i++) {
            for (int j = 1; j <= i - 1; j++) {
                if (j >= 1 && j != i) {
                    System.out.print(" ");
                }
                if (j == i - 1) {
                    System.out.print("*" + "\n");
                }
            }
        }
    }

    static void fig3(int n, int h) {

        for (int i = 1; i <= n; i++) {


            if (i >= 2) {

                System.out.print("*");
                for (int g = 1; g < h - 1; g++) {
                    System.out.print(" ");
                }
                if (i >= 3) {
                    System.out.print("*");
                }
                System.out.print("\n");

            }
            for (int j = 1; j <= h - 1; j++) {
                if (i == 1) {
                    System.out.print("*");
                }
            }

            if (i == n) {
                for (int k = 1; k <= h; k++) {
                    System.out.print("*");

                }
            }

        }
    }
}

