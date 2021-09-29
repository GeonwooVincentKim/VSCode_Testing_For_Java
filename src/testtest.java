import java.util.Scanner;
import static java.lang.System.out;

public class testtest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();
        int counter = 0;

        // out.println(input % 10);
        for (int i = input; i > 0; i /= 10) {
            if (i % 10 == 0) {
                counter++;
            } else {
                break;
            }
        }

        // for (int i = 0; i < input; i++) {
        // if (input % 10 == 0) {

        // } else {

        // }
        // }

        out.println(counter);

        sc.close();
    }
}
