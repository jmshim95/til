import java.io.*;
import java.util.Objects;

public class Main_11718 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String s = br.readLine();
            if (Objects.isNull(s)) break;
            sb.append(s).append("\n");
        }

        bw.write(sb.toString());
        br.close();
        bw.close();
    }
}