import java.io.*;

public class Main_2720 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int c = Integer.parseInt(br.readLine());
            int quarter = c / 25;
            int q = c % 25;
            int dime = q / 10;
            int d = q % 10;
            int nickel = d / 5;
            int penny = d % 5;

            sb.append(quarter).append(" ").append(dime).append(" ").append(nickel).append(" ").append(penny).append("\n");
        }

        bw.write(sb.toString());
        br.close();
        bw.close();
    }
}