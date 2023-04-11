import java.io.*;

public class Main_2292 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int cnt = 1;
        int i = 0;
        int j = 1;
        while (n > j) {
            i += 6;
            j += i;
            cnt++;
        }

        bw.write(String.valueOf(cnt));
        br.close();
        bw.close();
    }
}