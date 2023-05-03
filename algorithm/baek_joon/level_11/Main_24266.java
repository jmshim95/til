import java.io.*;
import java.math.BigInteger;

public class Main_24266 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        BigInteger bi = new BigInteger(br.readLine());

        sb.append(bi.pow(3)).append("\n").append(3);

        bw.write(sb.toString());
        br.close();
        bw.close();
    }
}