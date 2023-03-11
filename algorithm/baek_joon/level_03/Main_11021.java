import java.io.*;
import java.util.StringTokenizer;

public class Main_11021 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        short t = Short.parseShort(br.readLine());

        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            sb.append("Case #").append(i+1).append(": ").append(Short.parseShort(st.nextToken()) + Short.parseShort(st.nextToken())).append("\n");
        }

        bw.write(sb.toString());
        br.close();
        bw.close();
    }
}