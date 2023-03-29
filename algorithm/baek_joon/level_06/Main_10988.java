import java.io.*;

public class Main_10988 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] s = br.readLine().split("");

        int j = s.length-1;
        int result = 1;
        for (int i = 0; i < s.length/2; i++) {
            if (!s[i].equals(s[j])) {
                result = 0;
                break;
            }
            j--;
        }

        bw.write(String.valueOf(result));
        br.close();
        bw.close();
    }
}