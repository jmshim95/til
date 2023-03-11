import java.io.*;

public class Main_2439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        short n = Short.parseShort(br.readLine());

        for (short i = 1; i <= n; i++) {
            for (int k = n; i < k; k--) {
                sb.append(" ");
            }
            for (short j = 0; j < i; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }

        bw.write(sb.toString());
        br.close();
        bw.close();
    }
}