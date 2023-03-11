import java.io.*;
import java.util.StringTokenizer;

public class Main_10951 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        String s;

        while ((s = br.readLine()) != null) {
            st = new StringTokenizer(s);
            short a = Short.parseShort(st.nextToken());
            short b = Short.parseShort(st.nextToken());
            sb.append(a + b).append("\n");
        }

        bw.write(sb.toString());
        br.close();
        bw.close();
    }
}