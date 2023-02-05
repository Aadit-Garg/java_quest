public class pattern_quest1 {
    public static void main(String[] args) {
        int n = 5;
        int m = 4;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == m - 1 || j == 0 || j == n - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        for (int i = m; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        for (int i = 1; i <= m + 1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        int number = 1;
        for (int i = 1; i <= m + 1; i++) {
            for (int j = 1; j <= i; j++, number++) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
        number = 1;
        System.out.println();
        System.out.println();
        for (int i = 1; i <= m + 1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((j + i) % 2);
                // System.out.print(number);
            }
            System.out.println();
        }
    }
}
