import java.io.*;

public class Main_3009 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int[] _x = new int[1001];
        int[] _y = new int[1001];
        int x = 0;
        int y = 0;

        for (int i = 0; i < 3; i++) {
            String[] s = br.readLine().split(" ");
            _x[Integer.parseInt(s[0])]++;
            _y[Integer.parseInt(s[1])]++;
        }

        for (int i = 0; i < _x.length; i++) {
            if (_x[i] == 1) x = i;
        }

        for (int i = 0; i < _y.length; i++) {
            if (_y[i] == 1) y = i;
        }

        sb.append(x).append(" ").append(y);

        bw.write(sb.toString());
        br.close();
        bw.close();
    }
}