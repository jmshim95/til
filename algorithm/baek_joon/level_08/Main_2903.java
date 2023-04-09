import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int a = 2;
        int b = 1;
        for (int i = 0; i < n; i++) {
            a += b;
            b *= 2;
        }

        bw.write(String.valueOf((int) Math.pow(a, 2)));
        br.close();
        bw.close();
    }
}