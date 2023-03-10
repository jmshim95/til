import java.io.*;
import java.util.StringTokenizer;

public class Main_15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t/4; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            sb.append(Short.parseShort(st.nextToken()) + Short.parseShort(st.nextToken()));
            sb.append("\n");
        }

        bw.write(sb.toString());

        br.close();
        bw.close();
    }
}