import java.io.*;
import java.util.Objects;
import java.util.StringTokenizer;

public class Main_10798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String[][] s = new String[15][15];

        for (int i = 0; i < 5; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = String.valueOf(st.nextToken());
            for (int j = 0; j < str.length(); j++) {
                s[i][j] = str.split("")[j];
            }
        }

        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 15; j++) {
                if (!Objects.isNull(s[j][i])) {
                    sb.append(s[j][i]);
                }
            }
        }

        bw.write(sb.toString());
        br.close();
        bw.close();
    }
}