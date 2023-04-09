import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int a = 1;
        int b = 2;
        int c = 3;
        int result = 4;
        for (int i = 0; i < n; i++) {
            result += (a * b) + (c * a);
            c += a * 2;
            b += a;
            a *= 2;
        }

        bw.write(String.valueOf(result));
        br.close();
        bw.close();
    }
}