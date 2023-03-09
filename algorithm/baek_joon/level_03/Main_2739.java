import java.io.*;

public class Main_2739 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int a = Integer.parseInt(br.readLine());

        for (int i = 1; i < 10; i++) {
            bw.append(String.valueOf(a)).append(" * ").append(String.valueOf(i)).append(" = ").append(String.valueOf(a * i)).append("\n");
        }

        bw.flush();

        br.close();
        bw.close();
    }
}