import java.io.*;

public class Main_24264 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        long i = (long) Math.pow(Integer.parseInt(br.readLine()), 2);
        sb.append(i).append("\n").append(2);

        bw.write(sb.toString());
        br.close();
        bw.close();
    }
}