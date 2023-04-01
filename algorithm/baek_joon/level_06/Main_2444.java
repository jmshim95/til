import java.io.*;

public class Main_2444 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int max = n * 2 - 1;

        for (int i = 1; i <= max; i++) {
            int abs = Math.abs(n - i);

            for (int j = 0; j < abs; j++) {
                sb.append(" ");
            }

            for (int j = 0; j < max - 2 * abs; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        
        bw.write(sb.toString());
        br.close();
        bw.close();
    }
}