import java.io.*;

public class Main_11720 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        br.readLine();

        char[] s = br.readLine().toCharArray();
        int rs = 0;

        for (char c : s)
            rs += Integer.parseInt(String.valueOf(c));

        bw.write(String.valueOf(rs));
        br.close();
        bw.close();
    }
}