import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        long i = Long.parseLong(br.readLine());
        long a = 0L;
        for (long j = i-1; j > 0; j--) {
            a += j;
        }
        sb.append(a).append("\n").append(2);

        bw.write(sb.toString());
        br.close();
        bw.close();
    }
}