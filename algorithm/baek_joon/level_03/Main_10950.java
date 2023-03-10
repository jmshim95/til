import java.io.*;
import java.util.StringTokenizer;

public class Main_10950 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());

        for (int i = 0; i < a; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            bw.append(String.valueOf(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()))).append("\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}