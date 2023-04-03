import java.io.*;

public class Main_2566 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int _x = 1;
        int _y = 1;
        int result = Integer.MIN_VALUE;
        int temp;

        for (int x = 1; x <= 9; x++) {
            String[] s = br.readLine().split(" ");
            for (int y = 1; y <= 9; y++) {
                temp = Integer.parseInt(s[y-1]);
                if (result < temp) {
                    result = temp;
                    _x = x;
                    _y = y;
                }
            }
        }

        sb.append(result).append("\n").append(_x).append(" ").append(_y);

        bw.write(sb.toString());
        br.close();
        bw.close();
    }
}