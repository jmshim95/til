import java.io.*;
import java.util.StringTokenizer;

public class Main_25304 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int x = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int r = 0;

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int price = Integer.parseInt(st.nextToken());
            int cnt = Integer.parseInt(st.nextToken());
            r += price * cnt;
        }

        if (x == r) {
            bw.write("Yes");
        } else {
            bw.write("No");
        }

        br.close();
        bw.close();
    }
}