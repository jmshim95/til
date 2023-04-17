import java.io.*;

public class Main_1085 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] s = br.readLine().split(" ");
        int x = Integer.parseInt(s[0]);
        int y = Integer.parseInt(s[1]);
        int w = Integer.parseInt(s[2]);
        int h = Integer.parseInt(s[3]);

        int a = Math.min(w - x, x);
        int d = Math.min(h - y, y);

        bw.write(String.valueOf(Math.min(a, d)));
        br.close();
        bw.close();
    }
}