<<<<<<< HEAD
package JavaProgrammingFundamentals;

import java.util.Scanner;

public class PrintAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        for (int i = a; i <= b; i++) {
            System.out.printf("%d ", i);
            sum = sum + i;

        }

        System.out.printf("%nSum: %d", sum);
    }
}
=======
package JavaProgrammingFundamentals;

import java.util.Scanner;

public class PrintAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        for (int i = a; i <= b; i++) {
            System.out.printf("%d ", i);
            sum = sum + i;

        }

        System.out.printf("%nSum: %d", sum);
    }
}
>>>>>>> 02d6b6877b193b4eb9bddb6b1008369e039491d1
