import java.io.*;

public class Main_1978 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" ");
        short cnt = 0;

        for (int i = 0; i < n; i++) {
            short a = Short.parseShort(s[i]);
            if (a == 1) continue;

            boolean isPrime = true;
            for (int j = 2; j < a; j++) {
                if (a % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) cnt++;
        }

        bw.write(String.valueOf(cnt));
        br.close();
        bw.close();
    }
}