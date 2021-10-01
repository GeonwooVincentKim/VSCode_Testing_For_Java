import static java.lang.System.out;

import java.util.Scanner;

public class splitNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();

        String getNumber = String.valueOf(input);
        char[] splitNumber = getNumber.toCharArray();

        for (int i = 0; i < splitNumber.length; i++) {
            out.println(splitNumber[i]);

        }

        sc.close();
    }
}
