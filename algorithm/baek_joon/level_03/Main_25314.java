import java.io.*;

public class Main_25314 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int a = Integer.parseInt(br.readLine());

        for (int i = 0; i < a/4; i++) {
            sb.append("long ");
        }

        sb.append("int");

        bw.write(sb.toString());

        br.close();
        bw.close();
    }
}