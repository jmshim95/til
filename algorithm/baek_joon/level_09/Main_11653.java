import java.io.*;

public class Main_11653 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        if (n != 1) {
            int a = 2;
            while (a <= n) {
                if (n % a == 0) {
                    n = n / a;
                    sb.append(a).append("\n");
                } else {
                    a++;
                }
            }
        }

        bw.write(sb.toString());
        br.close();
        bw.close();
    }
}