import java.io.*;

public class Main_5622 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        char[] chars = s.toCharArray();
        short sec = 0;

        for (int c : chars) {
            if (c >= 90) c -= 2;
            else if (c >= 83) c -= 1;
            sec += (c % 65) / 3 + 3;
        }

        bw.write(String.valueOf(sec));
        br.close();
        bw.close();
    }
}