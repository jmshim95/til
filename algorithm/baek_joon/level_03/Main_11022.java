import java.io.*;
import java.util.StringTokenizer;

public class Main_11022 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        short t = Short.parseShort(br.readLine());

        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine());
            short a = Short.parseShort(st.nextToken());
            short b = Short.parseShort(st.nextToken());
            sb.append("Case #").append(i + 1).append(": ").append(a).append(" + ").append(b).append(" = ").append(a+b).append("\n");
        }

        bw.write(sb.toString());
        br.close();
        bw.close();
    }
}