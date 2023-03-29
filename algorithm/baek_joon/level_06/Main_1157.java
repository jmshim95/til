import java.io.*;

public class Main_1157 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        char[] chars = br.readLine().toCharArray();
        char character = 0;
        int[] alphabet = new int[26];

        int max = Integer.MIN_VALUE;

        for (char aChar : chars) {
            char c = aChar;

            if (c > 96) {
                c -= 32;
            }

            if (++alphabet[c - 65] > max) {
                max = alphabet[c - 65];
                character = c;
            }
        }

        int maxCnt = 0;
        for (int j : alphabet) {
            if (j == max) {
                maxCnt++;
            }
        }

        if (maxCnt > 1) {
            bw.write("?");
        } else {
            bw.write(String.valueOf(character));
        }

        br.close();
        bw.close();
    }
}