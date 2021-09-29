import static java.lang.System.out;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int inputNumber = sc.nextInt();
        int counter = 0;
        int factorialNumber = 1;

        for (int j = 1; j <= inputNumber; j++) {
            factorialNumber *= j;
        }

        out.println(factorialNumber);

        for (int i = factorialNumber; i > 0; i /= 10) {
            if (i % 10 == 0) {
                counter++;
            } else {
                break;
            }
        }

        out.println(counter);
        sc.close();
    }
}
