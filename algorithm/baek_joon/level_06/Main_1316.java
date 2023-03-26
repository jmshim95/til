import java.io.*;

public class Main_1316 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            boolean isGroupWord = true;
            char[] chars = br.readLine().toCharArray();

            f:
            for (int j = 0; j < chars.length; j++) {
                for (int k = 0; k < chars.length; k++) {
                    if (chars[j] == chars[k] && Math.abs(j - k) > 1) {
                        for (int l = j; l <= k; l++) {
                            if (chars[j] != chars[l]) {
                                isGroupWord = false;
                                break f;
                            }
                        }
                    }
                }
            }

            if (isGroupWord) cnt++;
        }

        bw.write(String.valueOf(cnt));
        br.close();
        bw.close();
    }
}