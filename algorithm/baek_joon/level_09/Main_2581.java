import java.io.*;

public class Main_2581 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        int sum = 0;
        int least = 0;

        for (int i = a; i <= b; i++) {
            if (i <= 1) continue;
            boolean isPrime = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                if (least == 0) {
                    least = i;
                }
                sum += i;
            }
        }

        if (sum == 0) {
            bw.write("-1");
        } else {
            bw.write(String.valueOf(sum));
            bw.write("\n");
            bw.write(String.valueOf(least));
        }

        br.close();
        bw.close();
    }
}