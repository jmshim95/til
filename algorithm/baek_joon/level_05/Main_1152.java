import java.io.*;
import java.util.StringTokenizer;

public class Main_1152 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        bw.write(String.valueOf(st.countTokens()));
        br.close();
        bw.close();
    }
}