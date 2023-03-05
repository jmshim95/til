import java.io.*;
import java.util.StringTokenizer;

public class Main_1330 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken()); // 공백 단위로 읽어들임
        int b = Integer.parseInt(st.nextToken());

        bw.write(a > b ? ">" : a < b ? "<" : "==");
        br.close();
        bw.close();
    }
}