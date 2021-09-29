// import static java.lang.System.out;

// import java.io.BufferedReader;
// import java.util.Scanner;
// import java.util.StringTokenizer;
// import java.io.*;

// public class Test {
//     // public static void main(String[] args) {
//     // Scanner scan = new Scanner(System.in);
//     // int n = scan.nextInt();
//     // int cnt = 0, num0 = 0;

//     // while (n > 4) {
//     // cnt++;
//     // n /= 5;
//     // }

//     // for (int i = 1; i <= cnt; i++)
//     // num0 += i;

//     // System.out.printf("0의 갯수는 %d개\n", num0);
//     // }
//     public static void main(String[] args) throws IOException {
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         StringTokenizer st = new StringTokenizer(br.readLine(), " ");

//         long N = Long.parseLong(st.nextToken());
//         long M = Long.parseLong(st.nextToken());

//         long five = FiveCount(N) - FiveCount(N - M) - FiveCount(M);
//         long two = TwoCount(N) - TwoCount(N - M) - TwoCount(M);

//         System.out.println(Math.min(five, two));
//     }

//     static long FiveCount(long num) { // 5 개수 세는 함수
//         int cnt = 0;

//         while (num >= 5) {
//             cnt += (num / 5);
//             num /= 5;
//         }
//         return cnt;
//     }

//     static long TwoCount(long num) { // 2 개수 세는 함수
//         int cnt = 0;

//         while (num >= 2) {
//             cnt += (num / 2);
//             num /= 2;
//         }
//         return cnt;
//     }
// }
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Test {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        long N = Long.parseLong(st.nextToken());
        long M = Long.parseLong(st.nextToken());

        long five = FiveCount(N) - FiveCount(N - M) - FiveCount(M);
        long two = TwoCount(N) - TwoCount(N - M) - TwoCount(M);

        System.out.println(Math.min(five, two));
    }

    static long FiveCount(long num) { // 5 개수 세는 함수
        int cnt = 0;

        while (num >= 5) {
            cnt += (num / 5);
            num /= 5;
        }
        return cnt;
    }

    static long TwoCount(long num) { // 2 개수 세는 함수
        int cnt = 0;

        while (num >= 2) {
            cnt += (num / 2);
            num /= 2;
        }
        return cnt;
    }
}