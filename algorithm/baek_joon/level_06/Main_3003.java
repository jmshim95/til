import java.io.*;

public class Main_3003 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int[] rules = {1, 1, 2, 2, 2, 8};
        String[] pieces = br.readLine().split(" ");

        for (int i = 0; i < rules.length; i++) {
            int diff = rules[i] - Integer.parseInt(pieces[i]);
            sb.append(diff).append(" ");
        }

        bw.write(sb.toString());
        br.close();
        bw.close();
    }
}