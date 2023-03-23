import java.io.*;
import java.util.Arrays;

public class Main_10809 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        char[] s = br.readLine().toCharArray();

        for (int i = 97; i <= 122; i++) {
            int index = -1;
            for (int j = 0; j < s.length; j++) {
                int c = s[j];
                if (c == i) {
                    index = j;
                    break;
                }
            }
            sb.append(index).append(" ");
        }
        bw.write(sb.toString());
        br.close();
        bw.close();
    }
}