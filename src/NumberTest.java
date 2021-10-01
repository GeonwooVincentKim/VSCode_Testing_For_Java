import static java.lang.System.out;

import java.util.Scanner;

public class NumberTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int sum2 = 0;

        for (int i = 0; i < 5; i++) {
            int inputValue = sc.nextInt();

            while (inputValue >= 10) {
                sum = inputValue;
                sum2 = 0;

                while (sum > 0) {
                    sum2 += sum % 10;
                    sum /= 10;
                }
                inputValue = sum2;
            }
            // for (int j = inputValue; j >= 0; j /= 10) {
            // // sum = j;
            // // out.println(inputValue);
            // if (j % 10 != 0) {
            // // out.println(j);
            // // sum = sum + (j % 10);
            // sum2 += sum % 10;
            // sum /= 10;
            // out.println(sum2 + " --> Sum");
            // out.println(sum + " --> sum0---");
            // out.println(j + " --> J");
            // // sum /= 10;
            // // out.println(sum);
            // if (sum > 10) {
            // sum = sum / 10;
            // // sum2 = sum2 + (sum % 10);
            // // out.println(sum2 + " --> Sum---");
            // }
            // } else {
            // // if (sum > 10 || sum % 10 != 0) {
            // // sum = sum + j;
            // // out.println(sum);
            // // }
            // }
            // // if ( < 10) {
            // // out.println(sum);
            // // }
            // // else {
            // // out.println(j);
            // // out.println(inputValue + " -> 최종");
            // // break;
            // // }
            // // out.println(inputValue);
            // // j = sum2;
            // }

            // // out.println(" --> 결과 값 : " + sum);
            // out.println(inputValue);
        }

        sc.close();
    }
}
