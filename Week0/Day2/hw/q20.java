package hw;



public class q20 {

    public static void main(String[] args) {
        int n = 7;

        for (int i = n - 3; i >= 1; i--) {
            for (int j = 1; j <= n; j++) {
                if (i == j || (i + j) == n + 1) {
                    System.out.print("* ");

                } else {
                    System.out.print("  ");

                }

            }
            System.out.println();
        }

        for (int i = 2; i <= n - 3; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j || (i + j) == n + 1) {
                    System.out.print("* ");

                } else {
                    System.out.print("  ");

                }

            }
            System.out.println();

        }

    }

}